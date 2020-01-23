package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ActionServlet extends HttpServlet {
    Logger logger = LoggerFactory.getLogger("logger");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("doGet invoking");
        req.getRequestDispatcher("/main.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("doPost invoking");
        String logLevel = req.getParameter("logLevel");
        doLog(logLevel);
        req.getRequestDispatcher("/main.jsp").forward(req, resp);
    }

    private void doLog(String logLevel){
        switch(logLevel){
            case "trace":
                logger.trace("trace action");
                break;
            case "debug":
                logger.debug("debug action");
                break;
            case "info":
                logger.info("info action");
                break;
            case "warn":
                logger.warn("warn action");
                break;
            case "error":
                logger.error("error action");
                break;
            default:
                logger.error("unknown action named {}", logLevel);
        }
    }
}

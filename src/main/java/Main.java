import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("logger");
        logger.trace("Hello from trace!");
        logger.debug("Hello from debug!");
        logger.info("Hello from info!");
        logger.warn("Hello from warn!");
        logger.error("Hello from error!");


        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);
    }
}

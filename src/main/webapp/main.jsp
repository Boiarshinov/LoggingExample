<%@ page contentType="text/html;charset=UTF-8" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Log example</title>
</head>
<body>

<form method="post" action="/">
    <table border="1">
        <tr>
            <td><input type="radio" name="logLevel" value="trace">trace</td>
            <th rowspan="5"><input type="submit" value="Log it!"></th>
        </tr>
        <tr><td><input type="radio" name="logLevel" value="debug" checked>debug</td></tr>
        <tr><td><input type="radio" name="logLevel" value="info">info</td></tr>
        <tr><td><input type="radio" name="logLevel" value="warn">warn</td></tr>
        <tr><td><input type="radio" name="logLevel" value="error">error</td></tr>
    </table>
</form>
Look at the Tomcat bin directory to find .log files
<br>
<br>

<form action="/status-messages">
    <button>View status messages</button>
</form>

</body>
</html>
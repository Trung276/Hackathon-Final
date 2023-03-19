<%--
  Created by IntelliJ IDEA.
  User: thanh
  Date: 3/18/2023
  Time: 11:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new team</title>
</head>
<body>
    <h1>Add new team</h1>
    <form action="AddServlet" method="post">
        <label>Team Name</label><br/>
        <input type="text" name="TeamName" /><br/>
        <label>Slogan</label><br/>
        <input type="text" name="Slogan"  /><br/>
        <input type = "submit"/>
    </form>
</body>
</html>

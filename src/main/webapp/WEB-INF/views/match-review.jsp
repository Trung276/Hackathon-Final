<%--
  Created by IntelliJ IDEA.
  User: h.danghuynhngoc
  Date: 18/03/2023
  Time: 10:30 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Matchup</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Home Team</th>
        <th>Away Team</th>
        <th>Result</th>
        <th>Location</th>
        <th>Match Time</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach var="matchup" items="${matchups}">
        <tr>
            <td>${matchup.id}</td>
            <td>${matchup.homeTeam}</td>
            <td>${matchup.awayTeam}</td>
            <td>${matchup.result}</td>
            <td>${matchup.location}</td>
            <td>${matchup.matchTime}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>


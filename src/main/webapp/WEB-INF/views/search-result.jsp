<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <div>
    <c:forEach items="${teams}" var="team">
        <p><c:out value="${team.name}"/></p>
        <p><c:out value="${team.logo}"/></p>
        <p><c:out value="${team.totalMember}"/></p>
        <p><c:out value="${team.slogan}"/></p>
        <p><c:out value="${team.elo}"/></p>
    </c:forEach>
  </div>
</body>
</html>

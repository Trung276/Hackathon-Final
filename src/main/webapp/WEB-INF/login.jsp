<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
</head>
<body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
<div class="container">
    <div class="card w-50 mx-auto my-5">
        <div class="card-header text-center"> UserLogin</div>
        <div class="card-body">
            <form action="/login" method="post">
                <div class="form-group">
                    <label>UserName</label>
                    <input type="text" class="form-control" name="username" placeholder="Enter your username">
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" class="form-control" name="password" placeholder="********">
                </div>

                <div class="text-center">
                    <button type="submit" class="btn btn-primary">Login</button>
                </div>
                <div style="font-weight: bold;font-size: large;font-family: Arial;text-align: center">
                    <c:if test="${not empty requestScope.message}">
                        <c:out value="${requestScope.message}"/>
                    </c:if>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
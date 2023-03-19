<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <title>Register</title>--%>
<%--    <script>--%>
<%--        function checkPassword() {--%>
<%--            var password = document.getElementById("password").value;--%>
<%--            var confirmPassword = document.getElementById("confirmPassword").value;--%>
<%--            if (password != confirmPassword) {--%>
<%--                alert("Password isn't correct!");--%>
<%--                return false;--%>
<%--            }--%>
<%--            return true;--%>
<%--        }--%>
<%--    </script>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>Register</h1>--%>
<%--<form action="/SuccessRegistryServlet" method="post" onsubmit="return checkPassword()">--%>
<%--    <input type="text" name="username" placeholder="Username" required><br>--%>
<%--    <input type="password" name="password" id="password" placeholder="Password" required><br>--%>
<%--    <input type="password" name="confirmPassword" id="confirmPassword" placeholder="Enter password again" required><br>--%>
<%--    <input type="text" name="name" placeholder="Name" required><br>--%>
<%--    <input type="text" name="age" placeholder="Age" required><br>--%>
<%--    <input type="text" name="phone" placeholder="Phone" required><br>--%>
<%--    <input type="hidden" name="action" value="Register">--%>
<%--    <input type="submit" value="Register">--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Register Form</title>

    <style>
        @import url('https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&family=Roboto:wght@100;300&display=swap');
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Poppins', sans-serif;
        }
        body{
            display: flex;
            height: 100vh;
            justify-content: center;
            align-items: center;
            padding: 10px;
            background-image: url("data:image/jpeg;base64,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");
        }
        .container{
            max-width: 700px;
            width: 100%;
            padding: 25px 30px;
            border-radius: 10px;
            background: lemonchiffon;
        }
        .container  .title{
            font-size: 25px;
            font-weight: 500;
            position: relative;
        }
        .container .title::before{
            content: '';
            position: absolute;
            left: 0;
            bottom: 0;
            height: 3px;
            width: 30px;
            background: linear-gradient(135deg, #71b7e6, #9b59b6);
        }
        .container form .user-details{
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
        }
        form .user-details .input-box{
            margin-bottom: 15px;
            width: calc(100% / 2 - 20px)
        }
        .user-details .input-box .details{
            display: block;
            font-weight: 500;
            margin-bottom: 5px;
        }
        .user-details .input-box input{
            height: 45px;
            width: 100%;
            outline: none;
            border-radius: 5px;
            border: 1px solid #ccc;
            padding-left: 15px;
            font-size: 16px;
            border-bottom-width: 2px;
            transition: all 0.3s ease;
        }

        .user-details .input-box input:focus,
        .user-details .input-box input:valid{
            border-color: #9b59b6;
        }
        form {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            background-color: #f2f2f2;
            padding: 20px;
            border-radius: 5px;
        }

        label {
            font-size: 18px;
            margin-bottom: 10px;
        }

        input[type="file"] {
            border: 2px solid #ccc;
            padding: 10px;
            margin-bottom: 20px;
            border-radius: 5px;
            font-size: 16px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 5px;
            font-size: 18px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #3e8e41;
        }

    </style>
    <script>
        function checkPassword() {
            let password = document.getElementById("password").value;
            let confirmPassword = document.getElementById("confirmPassword").value;
            if (password != confirmPassword) {
                alert("Password isn't correct!");
                return false;
            }
            return true;
        }
    </script>

</head>
<body>

<div class="container">
    <div class="title">Registration</div>
    <form  action="/SuccessRegistryServlet" method="post" onsubmit="return checkPassword()" >
        <div class="user-details">
            <div class="input-box">
                <span class="details">User name</span>
                <input type="text" name="username" placeholder="Enter your user name" required>
            </div>
            <div class="input-box">
                <span class="details">Password</span>
                <input type="password" name="password" placeholder="Enter your password" required>
            </div>
            <div class="input-box">
                <span class="details">Confirm Password</span>
                <input type="password" name="confirmPassword" placeholder="Confirm password" required>
            </div>
            <div class="input-box">
                <span class="details">Name</span>
                <input type="text" name="name" placeholder="Enter your name" required >
            </div>
            <div class="input-box">
                <span class="details">Age</span>
                <input type="text" name="age" placeholder="Enter your age" required>
            </div>
            <div class="input-box">
                <span class="details">Phone</span>
                <input type="text" name="phone" placeholder="Enter your phone number" required>
            </div>
        </div>
        <input type="submit" value="Register">
    </form>
</div>
</body>
</html>

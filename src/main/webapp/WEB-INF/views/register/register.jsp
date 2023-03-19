<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <script>
        function checkPassword() {
            var password = document.getElementById("password").value;
            var confirmPassword = document.getElementById("confirmPassword").value;
            if (password != confirmPassword) {
                alert("Password isn't correct!");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<h1>Register</h1>
<form action="/SuccessRegistryServlet" method="post" onsubmit="return checkPassword()">
    <input type="text" name="username" placeholder="Username" required><br>
    <input type="password" name="password" id="password" placeholder="Password" required><br>
    <input type="password" name="confirmPassword" id="confirmPassword" placeholder="Enter password again" required><br>
    <input type="text" name="name" placeholder="Name" required><br>
    <input type="text" name="age" placeholder="Age" required><br>
    <input type="text" name="phone" placeholder="Phone" required><br>
    <input type="hidden" name="action" value="Register">
    <input type="submit" value="Register">
</form>
</body>
</html>
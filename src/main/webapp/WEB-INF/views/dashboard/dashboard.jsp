<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style>
        /* Reset CSS */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        /* Typography */
        body {
            font-family: Arial, sans-serif;
            font-size: 16px;
            line-height: 1.5;
            color: #333;
        }

        h1, h2, h3, h4, h5, h6 {
            margin: 0;
            font-weight: normal;
        }

        h1 {
            font-size: 36px;
            text-align: center;
            margin-top: 50px;
            margin-bottom: 20px;
        }

        h3 {
            font-size: 24px;
            margin-bottom: 10px;
        }

        /* Layout */
        .container {
            display: flex;
            justify-content: space-between;
            align-items: center;
            background-color: #e0e0e0;
            padding: 20px;
        }

        .logo {
            display: flex;
            align-items: center;
            justify-content: space-between;
            width: 20%;
        }

        .search {
            clear: both;
            margin-top: 20px;
        }

        form {
            margin: 0;
        }

        input[type="text"], input[type="submit"] {
            height: 32px;
            border: none;
            outline: none;
            font-size: 16px;
            padding: 0 10px;
            margin-right: 10px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
        }

        table {
            border-collapse: collapse;
            width: 100%;
            margin-bottom: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #007bff;
            color: #fff;
        }

        .team-action a {
            display: inline-block;
            padding: 6px 12px;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            margin-right: 10px;
        }

        .team-action a:hover {
            background-color: #0069d9;
        }

        /* Responsive */
        @media (max-width: 768px) {
            .container {
                flex-direction: column;
                align-items: stretch;
            }

            .logo {
                width: 100%;
                margin-bottom: 20px;
            }

            .search {
                margin-top: 0;
            }
        }
        .container {
            display: flex;
        }
        .logo {
            display: flex;
            align-items: center;
            justify-content: space-between;
            width: 20%;
            padding: 20px;
            background-color: #e0e0e0;
        }
        .search {
            clear: both;
        }
        /* thêm kiểu cho button */
        button {
            font-size: 18px; /* làm cho chữ lớn hơn */
            text-align: left; /* căn giữa chữ */
            background-color: dodgerblue; /* màu nền của button */
            color: white; /* màu chữ trên button */
            padding: 10px 20px; /* thêm padding cho button */
            border: none; /* loại bỏ đường viền của button */
            border-radius: 5px; /* bo tròn cạnh của button */
        }
        .search {
            display: flex;
            justify-content: left;
            align-items: center;
            margin: 20px 0;
        }

        .search form {
            display: flex;
            flex-wrap: nowrap;
            border: 2px solid #ccc;
            border-radius: 10px;
            overflow: hidden;
        }

        .search input[type="text"] {
            flex-grow: 1;
            border: none;
            outline: none;
            padding: 10px;
            font-size: 16px;
        }

        .search input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            outline: none;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
        }

        .search input[type="submit"]:hover {
            background-color: #0062cc;
        }


    </style>
</head>

<body>
<div class="container">
    <div>
        <form action="/HomeServlet" method="get">
            <button type="submit" style="text-align: center; font-size: 50px;color: #0077be">PHUI CONNECT</button>
        </form>
    </div>
    <div>
        <form action="/InformationUserServlet" method="get">
            <button type="submit">YOUR ACCOUNT</button>
        </form>
    </div>
</div>
<div class="search">
    <form action="/SearchTeamServlet" method="post" >
        <input type="text" name="searchTeam" placeholder="Enter name of team">
        <input type="submit" value="Search">
    </form>

</div>
<div style="width: 60%; padding: 20px;">
    <!-- Khung chính -->
    <div style="display: flex; justify-content: flex-end;">
        <!-- Khung bên phải -->
        <div style="text-align: left;">
            <button style="float: left;"><a style="text-decoration: none" href="/add">Create NewTeam</a></button>
        </div>
    </div>
    <br><br>
    <div style="padding: 20px; background-color: #f0f0f0;">
        <!-- Khung chứa các đội bóng -->
        <h3>Team</h3>
        <table border="1">
            <tr>
                <th>ID</th>
                <th >Team Name</th>
                <th>slogan</th>
                <th>elo</th>
                <th colspan="2">Action</th>
            </tr>

            <c:forEach items="${teamList}" var="team">
                <tr>
                    <td name="id"><c:out value="${team.id}"/></td>
                    <td><c:out value="${team.team_name}"/></td>
                    <td><c:out value="${team.slogan}"/></td>
                    <td><c:out value="${team.elo}"/></td>
                    <td><a href="/AcceptServlet">Join Team</a></td>
                    <td><a href="/CreateMatchServlet">Create Match</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <br><br>
    <div style="padding: 20px; background-color: #f0f0f0;">
        <!-- Khung chứa lịch sử trận bóng -->
        <h3>Match history of your team</h3>
        <table>
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
        </table>
    </div>
</div>
</div>
</body>
</html>
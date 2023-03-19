<!DOCTYPE html>
<html>
<head>
    <title>PHUI CONNECT</title>
    <style>
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
    </style>
</head>
<body>
<div class="container">
    <div class="logo" style="display: flex; align-items: center; justify-content: space-between; width: 20%; padding: 20px; background-color: #e0e0e0;">
        <a href="home.jsp"><img src="logo.png"></a>
        <p style="margin-left: auto; margin-right: 0;">Your account</p>
    </div>
</div>
<div class="search">
    <form method="post" action="search">
        <input type="text" placeholder="Enter name of team">
        <input type="submit" value="Search">
    </form>
    </form>
</div>
<div style="width: 60%; padding: 20px;">
    <!-- Khung chính -->
    <div style="display: flex; justify-content: flex-end;">
        <!-- Khung bên phải -->
        <div style="padding: 20px; background-color: #e0e0e0;">
            <<button>Create your team</button>> <!-- Nút tạo đội -->
        </div>
    </div>
    <br><br>
    <div style="padding: 20px; background-color: #f0f0f0;">
        <!-- Khung chứa các đội bóng -->
        <h3>Team</h3>
        <table>
            <tr>
                <th>team name</th>
                <th></th>
            </tr>
            <tr>
                <td>Đội A</td>
                <td>
                    <button>Xem thông tin</button> <!-- Nút xem thông tin -->
                    <button>Gia nhập</button> <!-- Nút gia nhập -->
                    <button>Gửi lời mời đấu</button> <!-- Nút gửi lời mời đấu -->
                </td>
            </tr>
            <tr>
                <td>Đội B</td>
                <td>
                    <button>Xem thông tin</button> <!-- Nút xem thông tin -->
                    <button>Gia nhập</button> <!-- Nút gia nhập -->
                    <button>Gửi lời mời đấu</button> <!-- Nút gửi lời mời đấu -->
                </td>
            </tr>
        </table>
    </div>
    <br><br>
    <div style="padding: 20px; background-color: #f0f0f0;">
        <!-- Khung chứa lịch sử trận bóng -->
        <h3>Lịch sử trận bóng</h3>
        <table>
            <tr>
                <th>Ngày</th>
                <th>Đội bóng</th>
            <tr>
                <td>01/01/2022</td>
                <td>Đội A</td>
            </tr>
            <tr>
                <td>02/01/2022</td>
                <td>Đội B</td>
            </tr>
        </table>
    </div>
</div>
</div>
</body>
</html>
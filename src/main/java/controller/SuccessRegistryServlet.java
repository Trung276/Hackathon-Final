package controller;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "SuccessRegistryServlet", value = "/SuccessRegistryServlet")
public class SuccessRegistryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;
        String password = request.getParameter("password");
        String userName = request.getParameter("username");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        int phone = Integer.parseInt(request.getParameter("phone"));

        User player =new User(userName, password, name, age, false, phone);

        try
        {
            String sql = "INSERT INTO player (id,username,user_password,player_name,age,is_captain,team_id,phọne) values (?, ?, ?, ?, ?, ?, ?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, player.getId());
            statement.setString(2, player.getUsername());
            statement.setString(3, player.getPassword());
            statement.setString(4, player.getName());
            statement.setInt(5, player.getAge());
            statement.setBoolean(6, player.isCaptain());
            statement.setInt(7,player.getPhone());
            statement.executeUpdate();
        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            if (conn != null) {
                // Đóng kết nối tới database
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        request.getRequestDispatcher("/WEB-INF/views/login/login.jsp").forward(request, response);
    }
}

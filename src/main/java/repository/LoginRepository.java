package repository;

import connection.DBConnection;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginRepository {
    private static final String LOGIN_SUCCESS = "select * from users where username = ? and password = ?";

    public User login(String username, String password) {
        User user = null;
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(LOGIN_SUCCESS);
            statement.setString(1,username);
            statement.setString(2,password);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String usernames = resultSet.getNString("username");
                String passwords = resultSet.getNString("password");
                user = new User(usernames, passwords);
            }
            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

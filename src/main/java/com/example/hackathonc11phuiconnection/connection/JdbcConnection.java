package com.example.hackathonc11phuiconnection.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    private static final String CONN_URL = "jdbc:mysql://localhost:3306/hackathon";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456789";
    private static final String DRIVER ="com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() {
        Connection connection;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(CONN_URL, USERNAME, PASSWORD);
            System.out.println("DB connected!");
            return connection;
        } catch (ClassNotFoundException|SQLException exception) {
            System.out.println("Can not find database!");
            exception.printStackTrace();
        }
        return null;
    }

   /* public static void main(String[] args) {
        Connection connection= JdbcConnection.getConnection();
        try {
            PreparedStatement preparedStatement = null;
            String createTeamSql = "INSERT INTO team (id, team_name,logo, slogan, elo) VALUES (?, ?, ?,?,?)";
            preparedStatement = connection.prepareStatement(createTeamSql);
            preparedStatement.setLong(1, 1L);
            preparedStatement.setString(2, "Team A");
            preparedStatement.setNull(3, Types.BLOB);
            preparedStatement.setString(4,"TEAM SLOGAN STAYS HERE");
            preparedStatement.setInt(5, 1000);
            preparedStatement.executeUpdate();
            preparedStatement.setLong(1, 2L);
            preparedStatement.setString(2, "Team B");
            preparedStatement.setNull(3, Types.BLOB);
            preparedStatement.setString(4,"TEAM SLOGAN STAYS HERE");
            preparedStatement.setInt(5, 1000);
            preparedStatement.executeUpdate();
            preparedStatement.setLong(1, 3L);
            preparedStatement.setString(2, "Team C");
            preparedStatement.setNull(3, Types.BLOB);
            preparedStatement.setString(4,"TEAM SLOGAN STAYS HERE");
            preparedStatement.setInt(5, 1000);
            preparedStatement.executeUpdate();
            preparedStatement.setLong(1, 4L);
            preparedStatement.setString(2, "Team D");
            preparedStatement.setNull(3, Types.BLOB);
            preparedStatement.setString(4,"TEAM SLOGAN STAYS HERE");
            preparedStatement.setInt(5, 1000);
            preparedStatement.executeUpdate();

            String createPlayerSql = "INSERT INTO player (id, username, user_password, player_name, age, avatar, phone, is_captain, team_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(createPlayerSql);
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 11; j++) {
                    long playerId = (i - 1) * 11 + j;
                    preparedStatement.setLong(1, playerId);
                    preparedStatement.setString(2, "player" + playerId);
                    preparedStatement.setString(3, "password");
                    preparedStatement.setString(4, "Player " + playerId);
                    preparedStatement.setLong(5, 20 + (playerId % 10));
                    preparedStatement.setNull(6, Types.BLOB);
                    preparedStatement.setInt(7, 123456789);
                    preparedStatement.setBoolean(8, false);
                    preparedStatement.setLong(9, i);
                    preparedStatement.executeUpdate();
                }
            }


            String createMatchupSql = "INSERT INTO matchup (id, home_team, away_team, result, location, match_time) VALUES (?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(createMatchupSql);
            preparedStatement.setLong(1, 1L);
            preparedStatement.setLong(2, 1L);
            preparedStatement.setLong(3, 2L);
            preparedStatement.setString(4, "0 -2");
            preparedStatement.setString(5, "Stadium A");
            preparedStatement.setTimestamp(6, Timestamp.valueOf("2023-03-17 14:30:00"));
            preparedStatement.executeUpdate();
            preparedStatement.setLong(1, 2L);
            preparedStatement.setLong(2, 3L);
            preparedStatement.setLong(3, 4L);
            preparedStatement.setString(4, "1 - 0");
            preparedStatement.setString(5, "Stadium B");
            preparedStatement.setTimestamp(6, Timestamp.valueOf("2023-03-18 15:00:00"));
            preparedStatement.executeUpdate();

            System.out.println("Data created successfully!");

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }*/
}
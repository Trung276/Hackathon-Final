package com.example.hackathonc11phuiconnection.controller;

import com.example.hackathonc11phuiconnection.connection.JdbcConnection;
import com.example.hackathonc11phuiconnection.model.Matchup;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "matchup", value = "/matchup")
public class matchup extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
/*            Class.forName("com.mysql.cj.jdbc.driver");*/
            Connection connection = JdbcConnection.getConnection();
            String sql = "SELECT * FROM matchup";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Matchup> matchups = new ArrayList<>();
            while (resultSet.next()) {
                Matchup matchup = new Matchup();
                matchup.setId(resultSet.getLong("id"));
                matchup.setHomeTeam(resultSet.getLong("home_team"));
                matchup.setAwayTeam(resultSet.getLong("away_team"));
                matchup.setResult(resultSet.getString("result"));
                matchup.setLocation(resultSet.getString("location"));
                matchup.setMatchTime(resultSet.getTimestamp("match_time").toLocalDateTime());
                matchups.add(matchup);
            }

            // Set the matchups as an attribute in the request object
            request.setAttribute("matchups", matchups);

            // Forward to the JSP page
            request.getRequestDispatcher("/WEB-INF/views/match-review.jsp").forward(request, response);

            // Close the database resources
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

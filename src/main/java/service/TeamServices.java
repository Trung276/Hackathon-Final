package service;

import connection.JdbcConnection;
import model.Team;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeamServices {
    private Connection connection;
    public TeamServices() {
        connection = JdbcConnection.getConnection();
    }
    public List<Team> getAllTeams() throws SQLException {
        List<Team> teams = new ArrayList<>();
        String query = "SELECT * FROM team";
        PreparedStatement stmt = connection.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Team team = new Team();
            team.setId(rs.getLong("id"));
            team.setName(rs.getString("team_name"));
            team.setLogo(rs.getBlob("logo"));
            team.setSlogan(rs.getString("slogan"));
            team.setElo(rs.getInt("elo"));
            teams.add(team);
        }
        return teams;
    }

    public List<Team> findTeamByName(String searchTeam) throws SQLException {
        List<Team> teams = new ArrayList<>();
        String query = "SELECT * FROM team WHERE team_name LIKE '%" + searchTeam + "%'";
        PreparedStatement stmt = connection.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Team team = new Team();
            team.setId(rs.getLong("id"));
            team.setName(rs.getString("team_name"));
            team.setLogo(rs.getBlob("logo"));
            team.setSlogan(rs.getString("slogan"));
            team.setElo(rs.getInt("elo"));
            teams.add(team);
        }
        return teams;
    }
}

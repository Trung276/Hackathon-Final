package service;

import connection.JdbcConnection;
import model.Team;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeamDao implements  ITeamDAO{
    private static final String INSERT_NEW_TEAM = "insert into team (team_name,slogan) value (?,?);";
    private static final String SELECT_ALL_TEAM = "select * from team;";
    private JdbcConnection jbdcconnection;

    public TeamDao() {
        jbdcconnection = new JdbcConnection();
    }
    @Override
    public void insertTeam(Team team) throws SQLException {
        try {
            Connection connection = jbdcconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(INSERT_NEW_TEAM);
            statement.setString(1,team.getTeam_name());
            statement.setString(2,team.getSlogan());
            statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Team> selectAllTeam() throws SQLException {
        List<Team> teams = new ArrayList<>();
        try{
            Connection connection = jbdcconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_TEAM);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String team_name = resultSet.getString("team_name");
                String slogan = resultSet.getString("slogan");
                Team team = new Team(id,team_name,slogan);
                teams.add(team);
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return teams;
    }
    public List<Team> findTeam(String searchTeam) throws SQLException {
        List<Team> teams = new ArrayList<>();
        try{
            Connection connection = jbdcconnection.getConnection();
            String query = "SELECT * FROM team WHERE team_name LIKE '%" + searchTeam + "%'";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String team_name = resultSet.getString("team_name");
                String slogan = resultSet.getString("slogan");
                Team team = new Team(id,team_name,slogan);
                teams.add(team);
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return teams;
    }
}

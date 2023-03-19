package service;



import model.Team;

import java.sql.SQLException;
import java.util.List;

public interface ITeamDAO {
    void insertTeam(Team team) throws SQLException;
    List<Team> selectAllTeam() throws SQLException;
}

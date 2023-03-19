package model;

import javax.servlet.annotation.MultipartConfig;

@MultipartConfig
public class Team {
    long id;
    String team_name;
    String slogan;
    int elo;

    public Team() {
    }

    public Team(long id, String team_name, String slogan) {
        this.id = id;
        this.team_name = team_name;
        this.slogan = slogan;
        this.elo = 0;
    }

    public Team(String team_name, String slogan) {
        this.team_name = team_name;
        this.slogan = slogan;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }




    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public int getElo() {
        return elo;
    }

    public void setElo(int elo) {
        this.elo = elo;
    }
}

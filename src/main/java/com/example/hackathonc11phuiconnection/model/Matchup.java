package com.example.hackathonc11phuiconnection.model;

import java.time.LocalDateTime;

public class Matchup {
    private Long id;
    private Long homeTeam;
    private Long awayTeam;
    private String result;
    private String location;
    private LocalDateTime matchTime;

    public Matchup(Long id, Long homeTeam, Long awayTeam, String result, String location, LocalDateTime matchTime) {
        this.id = id;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.result = result;
        this.location = location;
        this.matchTime = matchTime;
    }

    public Matchup(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Long homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Long getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Long awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(LocalDateTime matchTime) {
        this.matchTime = matchTime;
    }
}


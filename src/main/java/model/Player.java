package model;

import java.sql.Blob;

public class Player {
    private int id;
    private String username;
    private String password;
    private String name;
    private int age;
    private Blob avatar;
    private boolean isCaptain;
    private int teamID;

    public Player() {
    }

    public Player(int id, String username, String password, String name, int age, Blob avatar, boolean isCaptain, int teamID) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.avatar = avatar;
        this.isCaptain = isCaptain;
        this.teamID = teamID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Blob getAvatar() {
        return avatar;
    }

    public void setAvatar(Blob avatar) {
        this.avatar = avatar;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", avatar=" + avatar +
                ", isCaptain=" + isCaptain +
                ", teamID=" + teamID +
                '}';
    }
}
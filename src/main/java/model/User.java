package model;

import java.sql.Blob;

public class User {
    private int id;
    private String username;
    private String password;
    private String name;
    private int age;
    private int phone;
    private boolean isCaptain;
    private int teamID;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int id, String username, String password, String name, int age, boolean isCaptain, int phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.isCaptain = isCaptain;
        this.phone = phone;
    }
    public User(String username, String password, String name, int age, boolean isCaptain, int phone) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.isCaptain = isCaptain;
        this.phone = phone;
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

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

    public int getPhone() {
        return phone;
    }

    public void setphone(int teamID) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", isCaptain=" + isCaptain +
                ", teamID=" + teamID +
                '}';
    }
}

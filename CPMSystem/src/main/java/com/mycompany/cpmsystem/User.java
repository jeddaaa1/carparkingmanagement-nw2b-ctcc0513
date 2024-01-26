package com.mycompany.cpmsystem;


public class User {
    private String username;
    private char[] password;
    private Object role;

    public User(String username, String password, Object role) {
        this.username = username;
        this.password = password.toCharArray();
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public char[] getPassword() {
        return password;
    }

    public Object getRole() {
        return role;
    }
}

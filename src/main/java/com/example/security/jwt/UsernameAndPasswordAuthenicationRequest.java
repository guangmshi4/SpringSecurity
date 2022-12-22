package com.example.security.jwt;

public class UsernameAndPasswordAuthenicationRequest {
    private String username;
    private String password;

    public UsernameAndPasswordAuthenicationRequest() {
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
}

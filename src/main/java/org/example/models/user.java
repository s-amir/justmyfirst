package org.example.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.beans.ConstructorProperties;

@Getter
@Setter
@NoArgsConstructor

public class user  {
    private String name;
    private String family;
    private String role;
    private String username;
    private String password;


    public user(String name, String family, String role, String username, String password) {
        this.name = name;
        this.family = family;
        this.role = role;
        this.username = username;
        this.password = password;
    }
}


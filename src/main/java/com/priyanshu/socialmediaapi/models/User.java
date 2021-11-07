package com.priyanshu.socialmediaapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Document(collection = "users")
public class User {

    @Id
    private String id;

    @Email
    @Indexed(unique = true)
    private final String email;
    private final String name;
    private String password;
    private int age;

    public User(String email, String name, String password, int age) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

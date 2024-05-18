package com.reviewtest.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name="id",nullable = false)
    private String id;
    @Column(name="userName",nullable = false)
    private String userName;
    @Column(name="password",nullable = false)
    private String password;
    @Column(name="firstName",nullable = false)
    private String firstName;
    @Column(name="lastName",nullable = false)
    private String lastName;

    public User(String id, String userName, String password, String firstName, String lastName) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

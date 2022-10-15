package com.example.myapplication;

import java.io.Serializable;

public class Student implements Serializable {
    private String secondName;
    private String firstName;
    private String fatherName;
    private String groupName;
    private String facultyName;
    private String specialtyName;
    private String login;
    private String password;
    private int course;

    public Student(String secondName, String firstName, String fatherName, String groupName,
                   String facultyName, String specialtyName, String login, String password, int course) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.groupName = groupName;
        this.facultyName = facultyName;
        this.specialtyName = specialtyName;
        this.login = login;
        this.password = password;
        this.course = course;
    }

    public void registration(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String  getFullName() {
        return secondName + " " + firstName + " " + fatherName;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getSpecialtyName() {
        return specialtyName;
    }

    public int getCourse() {
        return course;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}

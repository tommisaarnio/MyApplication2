package com.tommisaarnio.myapplication2;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String degreeProgram;

    protected int image = R.drawable.lebron;

    public User(String firstName, String lastName, String email, String degreeProgram) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public int getImage() {
        return image;
    }
}


package com.example.henryvo.myapplication;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 * Created by RAYMOND on 18/04/2015.
 */
public class Student extends User {
    private int studentID;
    private String firstName;
    private String lastName;


    public Student(String userEmail, String password, int studentID, String firstName, String lastName) throws InvalidKeySpecException, NoSuchAlgorithmException {
        super(userEmail, password, 1);
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //temp
    public Student() {
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
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

    @Override
    public String toString(){
        String s = studentID + " " +firstName + " " + lastName + " userID: " + getUserID();
        return s;
    }

}


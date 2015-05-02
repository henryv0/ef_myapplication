package com.example.henryvo.myapplication;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 * Created by Vanessa on 2/05/2015.
 */
public class Admin extends User {
    private int adminID;

    /**
     * Not sure how adminID will be stored and accessed in the class
     * @param userEmail
     * @param password
     */
    public Admin(String userEmail, String password) throws InvalidKeySpecException, NoSuchAlgorithmException {
        super(userEmail, password, 0);
        //this.adminID = adminID;
    }

    public Admin() {

    }

    /**
     * Will be null in Java object but pk in database
     * @return
     */
    public int getAdminID() {
        return adminID;
    }


    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

}


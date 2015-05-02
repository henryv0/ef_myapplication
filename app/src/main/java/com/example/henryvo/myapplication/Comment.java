package com.example.henryvo.myapplication;

import java.util.Date;

/**
 * Created by Vanessa on 2/05/2015.
 */
public class Comment {

    private int commentID;
    private int userID;
    private int eventID;
    private Date commentDate;
    private String commentText;


    public Comment(int userID, int eventID, Date commentDate, String commentText) {
        this.userID = userID;
        this.eventID = eventID;
        this.commentDate = commentDate;
        this.commentText = commentText;
    }

    //sadads

    public Comment() {
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }


}


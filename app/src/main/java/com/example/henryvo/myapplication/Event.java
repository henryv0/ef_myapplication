package com.example.henryvo.myapplication;

import java.util.Date;

/**
 * Created by Vanessa on 2/05/2015.
 */
public class Event {
    private int eventID;
    private String eventLocation;
    private Date eventDate;
    private String eventName;
    private String eventDescription;
    private String eventLink;
    private Date eventStartTime;
    private Date eventEndTime;
//asdasd


    private int societyID;

    public Event(String eventName, String eventLocation, Date eventDate, String eventDescription,
                 String eventLink, Date eventStartTime, Date eventEndTime) {
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
        this.eventDescription = eventDescription;
        this.eventLink = eventLink;
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
    }

    // Empty Constructor to delete
    public Event() {

    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public int getSocietyID() {
        return societyID;
    }

    public void setSocietyID(int societyID) {
        this.societyID = societyID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLink() {
        return eventLink;
    }

    public void setEventLink(String eventLink) {
        this.eventLink = eventLink;
    }

    public Date getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(Date eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public Date getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(Date eventEndTime) {
        this.eventEndTime = eventEndTime;
    }
}


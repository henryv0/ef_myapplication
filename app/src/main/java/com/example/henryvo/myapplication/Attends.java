package com.example.henryvo.myapplication;

/**
 * Created by Vanessa on 2/05/2015.
 */
public class Attends {
    private int eventID;
    private int studentID;
    private String attendStatus;

    /**
     *
     * @param eventID
     * @param studentID
     * @param attendStatus
     */
    public Attends(int eventID, int studentID, String attendStatus) {
        this.eventID = eventID;
        this.studentID = studentID;
        this.attendStatus = attendStatus;
    }


    public int getEventID() { return eventID; }

    public void setEventID(int eventID) { this.eventID = eventID; }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getAttendStatus() {
        return attendStatus;
    }

    public void setAttendStatus(String attendStatus) {
        this.attendStatus = attendStatus;
    }


}


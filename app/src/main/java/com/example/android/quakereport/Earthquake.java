package com.example.android.quakereport;

public class Earthquake {
    private String magnitude;
    private String location;
    private String mydate;

    public Earthquake(String magn, String loc, String date){
        magnitude= magn;
        location=loc;
        mydate= date;
    }

    public String getMydate() {
        return mydate;
    }

    public void setMydate(String mydate) {
        this.mydate = mydate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }
}

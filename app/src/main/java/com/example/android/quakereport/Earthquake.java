package com.example.android.quakereport;

public class Earthquake {
    private String magnitude;
    private String location;
    private long timeInMilliseconds;

    public Earthquake(String magn, String loc, long date){
        magnitude= magn;
        location=loc;
        timeInMilliseconds= date;
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

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }

    public void setTimeInMilliseconds(long timeInMilliseconds) {
        this.timeInMilliseconds = timeInMilliseconds;
    }
}

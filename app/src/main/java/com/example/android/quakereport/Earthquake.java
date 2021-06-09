package com.example.android.quakereport;

public class Earthquake {
    private double magnitude;
    private String location;
    private long timeInMilliseconds;

    public Earthquake(double magn, String loc, long date){
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



    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }

    public void setTimeInMilliseconds(long timeInMilliseconds) {
        this.timeInMilliseconds = timeInMilliseconds;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
}

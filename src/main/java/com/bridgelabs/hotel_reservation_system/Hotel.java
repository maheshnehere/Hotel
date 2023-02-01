package com.bridgelabs.hotel_reservation_system;

public class Hotel {
    private String name;
    private int rate;

    public Hotel(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    public String toString() {
        return "Name: "+name+" Rate: "+rate;
    }
}

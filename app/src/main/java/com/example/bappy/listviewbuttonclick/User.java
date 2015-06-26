package com.example.bappy.listviewbuttonclick;

/**
 * Created by Bappy on 6/26/2015.
 */
public class User {
    String name;
    String address;
    String location;

    public User(String location, String name, String address) {
        this.location = location;
        this.name = name;
        this.address = address;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

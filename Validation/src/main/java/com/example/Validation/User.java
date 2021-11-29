package com.example.Validation;

import javax.validation.constraints.Size;

public class User {
    private int zipcode;
    @Size(min = 1, max = 15, message = "required")
    private String state;
    private String city;
    private String country;

    public User() {
    }

    public User(int zipcode, String state, String city, String country) {
        super();
        this.zipcode = zipcode;
        this.state = state;
        this.city = city;
        this.country = country;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "User{" +
                "zipcode=" + zipcode +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

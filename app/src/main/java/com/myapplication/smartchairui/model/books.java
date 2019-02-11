package com.myapplication.smartchairui.model;

/**
 * Created by samruddhi on 3/2/19.
 */

public class books {
    public String name;
    public String year;
    public String image;

    public books(String name, String year, String image) {
        this.name = name;
        this.year = year;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

package com.daw;

public class Guest extends Person{
    public String nacionality;

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public Guest(String nacionality) {
        this.nacionality = nacionality;
    }

    
}

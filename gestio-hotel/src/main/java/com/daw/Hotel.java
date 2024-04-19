package com.daw;


public class Hotel {
    
    private String name;
    private String address;
    private String web;
    private enum HotelCategory{
        OneStar,TwoStars,ThreeStars,FourStars,FiveStars
    }

    private Manager manager;

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
    public String getWeb() {
        return web;
    }
    public void setWeb(String web) {
        this.web = web;
    }
    
    public Hotel(String name, String address, String web) {
        this.name = name;
        this.address = address;
        this.web = web;
    }
    @Override
    public String toString() {
        return "Hotel [name=" + name + ", address=" + address + ", web=" + web + "]";
    }
    
    
    
}

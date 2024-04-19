package com.daw;

/**
 * Class which implements the hotel object
 */

public class Hotel {
    
    private String name;
    private String address;
    private String web;
    private enum HotelCategory{
        OneStar,TwoStars,ThreeStars,FourStars,FiveStars
    }

    private Manager manager;
    
    /**
     * Method that returns the hotel manager.
     * @return the object Manager associated with the class
     */
    public Manager getManager() {
        return manager;
    }
    /**
     * Method that allows to set an Manager type object to the class
     * @param manager is the object manager
     */
    public void setManager(Manager manager) {
        this.manager = manager;
    }
    /**
     * Method that returns the hotel's name
     * @return hotel's name
     */
    public String getName() {
        return name;
    }
    /**
     * Method that allows setting a name for the hotel
     * @param name is the name that will be chosen for the hotel
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Method that allows getting the hotel's address
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * Method that allows setting a new address for the Hotel
     * @param address is the address that the hotel will have
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * Method that allows getting the hotel's webpage url
     * @return hotel's url
     */
    public String getWeb() {
        return web;
    }
    /**
     * Method that allows setting a new web url
     * @param web is the new url the hotel will have
     */
    public void setWeb(String web) {
        this.web = web;
    }
    /**
     * Constructor method that allows the creation of an object type Hotel
     * @param name hotel's name
     * @param address hotel's address
     * @param web hotel's web
     * @param manager hotel's manager
     */
    public Hotel(String name, String address, String web, Manager manager) {
        this.name = name;
        this.address = address;
        this.web = web;
        this.manager = manager;
    }
    /**
     * Method that allows retrieving all the attributes from the class Hotel
     * @return the class attributes
     */
    @Override
    public String toString() {
        return "Hotel [name=" + name + ", address=" + address + ", web=" + web + ", manager=" + manager + "]";
    }
    
    
    
    
}

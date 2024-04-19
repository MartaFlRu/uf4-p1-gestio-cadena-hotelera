package com.daw;

/**
 * Class that implements the guest object, it is a child class from Person
 */
public class Guest extends Person{
    public String nacionality;

    /**
     * Method that allows getting the guest's nationality
     * @return guest's nationality
     */
    public String getNacionality() {
        return nacionality;
    }
    /**
     * Method that allows setting the guest's nationality
     * @param nacionality is the nationality that will be chosen for the guest
     */
    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }
    /**
     * Constructor method that allows the creation of a guest
     * Besides, this method retrieves the parent's attributes and adds them to the parameters
     * @param name is the guest's name
     * @param identifier is the guest's identifier
     * @param nacionality is the guest's nationality
     */
    public Guest(String name, String identifier, String nacionality) {
        super(name, identifier);
        this.nacionality = nacionality;
    }

    
    
}

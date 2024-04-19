package com.daw;

import java.time.LocalDate;
/**
 * Class that implements the manager object, it is a child class from Person
 */
public class Manager extends Person {
    private LocalDate startDate;
    private int experience;

    /**
     * Method that allows getting the start date in which the manager commenced their work
     * @return the start date
     */
    public LocalDate getStartDate() {
        return startDate;
    }
    /**
     * Method that allows to set a new start date
     * @param startDate new date in which the manager started working
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    /**
     * Method that allows getting the manager's years of experience 
     * @return the manager's experience
     */
    public int getExperience() {
        return experience;
    }
    /**
     * Method that allows introducing a new value to the experience years
     * @param experience the years of experience
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }
    /**
     * Constructor method that allows the creation of a Manager type object
     * Besides, this method retrieves the parent's attributes and adds them to the parameters
     * @param name the manager's name
     * @param identifier the manager's identifier
     * @param startDate the manager's starting date
     * @param experience the manager's experience
     */
    public Manager(String name, String identifier, LocalDate startDate, int experience) {
        super(name, identifier);
        this.startDate = startDate;
        this.experience = experience;
    }
    
   
    

    
}

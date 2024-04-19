package com.daw;
/**
 * Class that implements the Person object, a parent class
 */
public abstract class Person {
    protected String name;
    protected String identifier;

    /**
     * Method that allows getting the person's name
     * @return the person's name
     */
    public String getName() {
        return name;
    }
    /**
     * Method that allows setting the person's name
     * @param name person's name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Method that allows to get de person's identifier
     * @return the person's identifier
     */
    public String getIdentifier() {
        return identifier;
    }
    /**
     * Method that allows setting the person's identifier
     * @param identifier the person's identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    /**
     * Constructor method 
     * @param name person's name
     * @param identifier person's identifier
     */
    public Person(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    
    
}

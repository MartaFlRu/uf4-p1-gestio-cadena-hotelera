package com.daw;

public abstract class Person {
    protected String name;
    protected String identifier;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    public Person(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    
    
}

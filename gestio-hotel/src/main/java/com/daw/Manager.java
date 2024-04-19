package com.daw;

import java.time.LocalDate;

public class Manager extends Person {
    private LocalDate startDate;
    private int experience;

    
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    
    public Manager(LocalDate startDate, int experience) {
        this.startDate = startDate;
        this.experience = experience;
    }
    

    
}

package org.launchcode.codingevents.models;

import javax.validation.constraints.*;
import java.util.Objects;

public class Event {
    private int id;
    private static int nextId = 1;
    @NotBlank(message = "Name is required")
    @Size(min = 3,max = 50,message = "Name must be between 3 and 50 characters")
    private String name;
    @Size(max = 500 ,message = "Description is too long")
    private String description;
    @NotBlank(message="Email is required")
    @Email(message = "Invalid Email.Try again")
    private String contactEmail;
    @NotBlank(message = "Location is required")
    @NotNull
    @Size(max = 50)
    private String location;
//    @Size(min=1,max=5,message = "Atleast one person ")
    private int noOfPeople;
    @AssertTrue(message = "Must require to register")
    private boolean mustRegister;
    public Event(String name,String description,String location,String contactEmail,int noOfPeople,boolean mustRegister) {
        this();
        this.name = name;
        this.description = description;
        this.location = location;
        this.contactEmail = contactEmail;
        this.noOfPeople = noOfPeople;
        this.mustRegister = mustRegister;
//        this.id = nextId;
//        nextId++;
    }
    public Event(){
        this.id = nextId;
        nextId++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNoOfPeople() {
        return noOfPeople;
    }

    public boolean isMustRegister() {
        return mustRegister;
    }

    public void setMustRegister(boolean mustRegister) {
        this.mustRegister = mustRegister;
    }

    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

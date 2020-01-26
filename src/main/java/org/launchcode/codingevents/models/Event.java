package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Event extends AbstractEntity {

    @NotBlank(message = "Name is required")
    @Size(min = 3,max = 50,message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500 ,message = "Description is too long")
    private String description;

    @NotBlank(message="Email is required")
    @Email(message = "Invalid Email.Try again")
    private String contactEmail;

    @NotBlank(message = "Location is required")
    @Size(max = 50)
    private String location;

    //    @Size(min=1,max=5,message = "Atleast one person ")
    private int noOfPeople;

    @ManyToOne
    @NotNull(message = "Category is required")
    private EventCategory eventCategory;

    public Event(String name,String description,String location,String contactEmail,int noOfPeople ,EventCategory eventCategory) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.contactEmail = contactEmail;
        this.noOfPeople = noOfPeople;
        this.eventCategory = eventCategory;
    }
    public Event(){

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

    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    @Override
    public String toString() {
        return name;
    }

}

package com.my.destinations.api.mydestinationsapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(mappedBy="address")
    private Destination destination;

    private String street;
    private String city;

    @NotNull
    @Size(min=2, max=2)
    private String state;
    
    private String zip;
    private String linkToMap;

    public Address() {
    }

    public Address(String street, String city, String state, String zip, String linkToMap) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.linkToMap = linkToMap;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLinkToMap() {
        return this.linkToMap;
    }

    public void setLinkToMap(String linkToMap) {
        this.linkToMap = linkToMap;
    }
}

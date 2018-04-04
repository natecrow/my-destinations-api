package com.my.destinations.api.mydestinationsapi.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@Entity
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade=CascadeType.ALL, mappedBy="destination")
    @Valid
    private Address address;
    
    @NotEmpty
    private String name;

    @NumberFormat(style=Style.CURRENCY)
    private BigDecimal cost;
    
    private Date dateTimeToVisit;
    
    private String linkToWebsite;
    private String phoneNumber;
    private String notes;

    public Destination() {
    }

    public Destination(Address address, String name, BigDecimal cost, Date dateTimeToVisit, String linkToWebsite, String phoneNumber, String notes) {
        this.address = address;
        this.name = name;
        this.cost = cost;
        this.dateTimeToVisit = dateTimeToVisit;
        this.linkToWebsite = linkToWebsite;
        this.phoneNumber = phoneNumber;
        this.notes = notes;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCost() {
        return this.cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Date getDateTimeToVisit() {
        return this.dateTimeToVisit;
    }

    public void setDateTimeToVisit(Date dateTimeToVisit) {
        this.dateTimeToVisit = dateTimeToVisit;
    }

    public String getLinkToWebsite() {
        return this.linkToWebsite;
    }

    public void setLinkToWebsite(String linkToWebsite) {
        this.linkToWebsite = linkToWebsite;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost='" + cost + '\'' +
                ", dateTimeToVisit='" + dateTimeToVisit + '\'' +
                ", linkToWebsite='" + linkToWebsite + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object other) {

        if (other == null) {
            return false;
        }

        if (other.getClass() != this.getClass()) {
            return false;
        }

        Destination otherDestination = (Destination) other;
        if (otherDestination.getId() == this.id &&
            otherDestination.getName().equals(this.name) &&
            otherDestination.getCost().equals(this.cost) &&
            otherDestination.getDateTimeToVisit().equals(this.dateTimeToVisit) &&
            otherDestination.getLinkToWebsite().equals(this.linkToWebsite) &&
            otherDestination.getPhoneNumber().equals(this.phoneNumber) &&
            otherDestination.getNotes().equals(this.notes)) {
                return true;
            }
        return false;
    }
}

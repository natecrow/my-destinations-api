package com.my.destinations.api.mydestinationsapi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class DestinationsList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String name;

    @ManyToMany(targetEntity = Destination.class,
                cascade = { CascadeType.DETACH, CascadeType.MERGE,
                            CascadeType.PERSIST, CascadeType.REFRESH }
    )
    @JoinTable(
        name = "DESTINATIONS_LIST_X_DESTINATIONS",
        joinColumns = @JoinColumn(name = "DESTINATIONS_LIST_ID",
                nullable = false,
                updatable = false),
        inverseJoinColumns = @JoinColumn(name = "DESTINATION_ID",
                nullable = false,
                updatable = false),
        foreignKey = @ForeignKey(ConstraintMode.CONSTRAINT),
        inverseForeignKey = @ForeignKey(ConstraintMode.CONSTRAINT)
    )
    private List<Destination> destinations;

    public DestinationsList() {
    }

    public DestinationsList(final String name, final List<Destination> destinations) {
        this.name = name;
        this.destinations = destinations;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Destination> getDestinations() {
        return this.destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    @Override
    public String toString() {
        return "Destination{" + "id=" + id + ", name='" + name + '\'' + ", destinations='" + this.destinations + '}';
    }
}

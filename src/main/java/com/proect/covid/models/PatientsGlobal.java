package com.proect.covid.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "global")
public class PatientsGlobal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "new_confirmed")
    private int newConfirmed;

    @Column(name = "total_confirmed")
    private int totalConfirmed;

    @Column(name = "new_deaths")
    private int newDeaths;

    @Column(name = "total_deaths")
    private int totalDeaths;

    @Column(name = "new_recovered")
    private int newRecovered;

    @Column(name = "total_recovered")
    private int totalRecovered;

    @Column(name = "date_time")
    private LocalDateTime dateTime;

    public PatientsGlobal() {
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public int getNewConfirmed() {
        return newConfirmed;
    }

    public void setNewConfirmed(int newConfirmed) {
        this.newConfirmed = newConfirmed;
    }

    public int getTotalConfirmed() {
        return totalConfirmed;
    }

    public void setTotalConfirmed(int totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    public int getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(int newDead) {
        this.newDeaths = newDead;
    }

    public int getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(int totalDead) {
        this.totalDeaths = totalDead;
    }

    public int getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(int newRecovered) {
        this.newRecovered = newRecovered;
    }

    public int getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(int totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}

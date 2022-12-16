package com.proect.covid.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "new_confirmed")
    private int newConfirmed;

    @Column(name = "total_confirmed")
    private int totalConfirmed;

    @Column(name = "new_dead")
    private int newDead;

    @Column(name = "total_dead")
    private int totalDead;

    @Column(name = "new_recovered")
    private int newRecovered;

    @Column(name = "total_recovered")
    private int totalRecovered;

    @Column(name = "date_time")
    private LocalDateTime dateTime;

    public Patient() {
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

    public int getNewDead() {
        return newDead;
    }

    public void setNewDead(int newDead) {
        this.newDead = newDead;
    }

    public int getTotalDead() {
        return totalDead;
    }

    public void setTotalDead(int totalDead) {
        this.totalDead = totalDead;
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

package com.invitee.Invitee_MicroService.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.invitee.Invitee_MicroService.utills.ApiConstants;
import jakarta.persistence.*;
import lombok.*;


@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 20,nullable = false)
    private String name;

    @Column(length = 50,nullable = false)
    private String address;

    private String photoUrls= ApiConstants.photoUrl;

    @Column(nullable = false)
    private String date;
    private String contactUs;
    private String mapLocation;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Invitee invitee;

    public Event() {
    }

    public Event(int id, String name, String address, String photoUrls, String date, String contactUs, String mapLocation, Invitee invitee) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.photoUrls = photoUrls;
        this.date = date;
        this.contactUs = contactUs;
        this.mapLocation = mapLocation;
        this.invitee = invitee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(String photoUrls) {
        this.photoUrls = photoUrls;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContactUs() {
        return contactUs;
    }

    public void setContactUs(String contactUs) {
        this.contactUs = contactUs;
    }

    public String getMapLocation() {
        return mapLocation;
    }

    public void setMapLocation(String mapLocation) {
        this.mapLocation = mapLocation;
    }

    public Invitee getInvitee() {
        return invitee;
    }

    public void setInvitee(Invitee invitee) {
        this.invitee = invitee;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", photoUrls='" + photoUrls + '\'' +
                ", date='" + date + '\'' +
                ", contactUs='" + contactUs + '\'' +
                ", mapLocation='" + mapLocation + '\'' +
                ", invitee=" + invitee +
                '}';
    }
}

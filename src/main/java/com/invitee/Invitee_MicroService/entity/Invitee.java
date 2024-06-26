package com.invitee.Invitee_MicroService.entity;

import com.invitee.Invitee_MicroService.enums.InviteeTypes;
import com.invitee.Invitee_MicroService.utills.ApiConstants;
import jakarta.persistence.*;
import lombok.*;

import java.security.PrivateKey;
import java.util.List;

@Entity
public class Invitee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 25,nullable = false)
    private String inviteeSurName;
    @Enumerated(EnumType.STRING)
    private InviteeTypes inviteeTypes = InviteeTypes.MARRIAGE;

    @Column(length = 25,nullable = false)
    private String heroName;

    @Column(length = 25,nullable = false)
    private String heroineName;

    @Column(length = 50,nullable = false)
    private String heroFatherAndMotherNames;

    @Column(length = 50,nullable = false)
    private String heroineFatherAndMotherNames;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "invitee")
    private List<Event> event;


//    @Column(length = 20,nullable = false)
//    private String eventName;
//
//    @Column(length = 50,nullable = false)
//    private String eventAddress;
//
//    private String eventPhotoUrls= ApiConstants.photoUrl;
//
//    @Column(nullable = false)
//    private String eventDate;
//    private String contactUs;
//    private String eventMapLocation;


    public Invitee() {
    }

    public Invitee(int id, String inviteeSurName, InviteeTypes inviteeTypes, String heroName, String heroineName, String heroFatherAndMotherNames, String heroineFatherAndMotherNames, List<Event> event) {
        this.id = id;
        this.inviteeSurName = inviteeSurName;
        this.inviteeTypes = inviteeTypes;
        this.heroName = heroName;
        this.heroineName = heroineName;
        this.heroFatherAndMotherNames = heroFatherAndMotherNames;
        this.heroineFatherAndMotherNames = heroineFatherAndMotherNames;
        this.event = event;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInviteeSurName() {
        return inviteeSurName;
    }

    public void setInviteeSurName(String inviteeSurName) {
        this.inviteeSurName = inviteeSurName;
    }

    public InviteeTypes getInviteeTypes() {
        return inviteeTypes;
    }

    public void setInviteeTypes(InviteeTypes inviteeTypes) {
        this.inviteeTypes = inviteeTypes;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroineName() {
        return heroineName;
    }

    public void setHeroineName(String heroineName) {
        this.heroineName = heroineName;
    }

    public String getHeroFatherAndMotherNames() {
        return heroFatherAndMotherNames;
    }

    public void setHeroFatherAndMotherNames(String heroFatherAndMotherNames) {
        this.heroFatherAndMotherNames = heroFatherAndMotherNames;
    }

    public String getHeroineFatherAndMotherNames() {
        return heroineFatherAndMotherNames;
    }

    public void setHeroineFatherAndMotherNames(String heroineFatherAndMotherNames) {
        this.heroineFatherAndMotherNames = heroineFatherAndMotherNames;
    }

    public List<Event> getEvent() {
        return event;
    }

    public void setEvent(List<Event> event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "Invitee{" +
                "id=" + id +
                ", inviteeSurName='" + inviteeSurName + '\'' +
                ", inviteeTypes=" + inviteeTypes +
                ", heroName='" + heroName + '\'' +
                ", heroineName='" + heroineName + '\'' +
                ", heroFatherAndMotherNames='" + heroFatherAndMotherNames + '\'' +
                ", heroineFatherAndMotherNames='" + heroineFatherAndMotherNames + '\'' +
                ", event=" + event +
                '}';
    }
}

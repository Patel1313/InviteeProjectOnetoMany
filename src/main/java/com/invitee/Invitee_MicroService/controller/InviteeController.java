package com.invitee.Invitee_MicroService.controller;

import com.invitee.Invitee_MicroService.entity.Invitee;
import com.invitee.Invitee_MicroService.repositry.EventRepo;
import com.invitee.Invitee_MicroService.repositry.InviteeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InviteeController {

    @Autowired
    private InviteeRepo inviteeRepo;
    private EventRepo eventRepo;

    @GetMapping("/welcome")
    public String welcome(){
        return "Hi, Hello Welcome";
    }

//    URl:-http://localhost:1313/save
//    input:-Json in below
//    {
//        "inviteeSurName": "bb1",
//            "inviteeTypes": "MARRIAGE",
//            "heroName": "bb1",
//            "heroineName": "bb1",
//            "heroFatherAndMotherNames": "bb1",
//            "heroineFatherAndMotherNames": "bb1",
//            "event": [
//        {
//            "name": "BB1",
//                "address": "bb1",
//                "photoUrls": "bb1",
//                "date": "01-07-2024",
//                "contactUs": "bb1",
//                "mapLocation": "bb1"
//        }
//        ]
//    }
    @PostMapping("/save")
    public Invitee saveInvitee(@RequestBody Invitee invitee){
        return inviteeRepo.save(invitee);
    }

    @GetMapping("/findAll")
    public List<Invitee> findAll(){
        return inviteeRepo.findAll();
    }
}

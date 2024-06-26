package com.invitee.Invitee_MicroService.repositry;

import com.invitee.Invitee_MicroService.entity.Invitee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface InviteeRepo extends JpaRepository<Invitee, UUID> {
}

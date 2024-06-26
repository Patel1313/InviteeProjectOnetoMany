package com.invitee.Invitee_MicroService.repositry;

import com.invitee.Invitee_MicroService.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepo extends JpaRepository<Event, Integer> {
}

package com.invitee.Invitee_MicroService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplicationt
public class InviteeMicroServiceApplication {

	public static String portNumber;
	@Value("${server.port}")
	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	public static void main(String[] args) {
		SpringApplication.run(InviteeMicroServiceApplication.class, args);
		System.out.println("INVITEE Project Started.......................");
		System.out.println("INVITEE Project running at http://localhost:"+portNumber);
	}

}

package com.codedecode.microservices.CitizenService.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codedecode.microservices.CitizenService.Entity.Citizen;

@SpringBootTest
class CitizenServiceRepoTests {

	@Autowired
	CitizenRepo citizenRepo;
	
	@Test
	void savemethod() {
		Citizen citizen = new Citizen();
		citizen.setCitizenName("Yash");
		citizen.setVaccinationCenterId(3);
		
		Citizen citizenSaved = citizenRepo.save(citizen);
		
		System.out.println("CitizenSaved: " + citizenSaved.toString());
	
	}

}

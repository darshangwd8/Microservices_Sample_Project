package com.codedecode.microservices.CitizenService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "citizen_name")
	private String citizenName; // in postman we should give this string name and not the @column name value 
	
	@Column(name = "vaccination_center_id")
	private int vaccinationCenterId;

	public int getId() {
		return id;
	}

	public String getCitizenName() {
		return citizenName;
	}

	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}

	public int getVaccinationCenterId() {
		return vaccinationCenterId;
	}

	public void setVaccinationCenterId(int vaccinationCenterId) {
		this.vaccinationCenterId = vaccinationCenterId;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Citizen [id=" + id + ", citizenName=" + citizenName + ", vaccinationCenterId=" + vaccinationCenterId
				+ "]";
	}




}

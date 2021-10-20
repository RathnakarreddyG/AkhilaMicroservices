package com.hospital.hospitalservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hospital")
public class Hospital {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long hospital_id;
	
	public String hospital_name;
	
	public String location;

	public Hospital() {
		super();
	}

	public Long getHospital_id() {
		return hospital_id;
	}

	public void setHospital_id(Long hospital_id) {
		this.hospital_id = hospital_id;
	}

	public String getHospital_name() {
		return hospital_name;
	}

	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	

}

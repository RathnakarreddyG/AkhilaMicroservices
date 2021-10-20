package com.patient.patientservice.models;

public class PatientDetailsDTO {
	
	public String patient_name;
	
	public String doctor_name;
	
	public String hospital_name;
	
	

	public PatientDetailsDTO() {
		super();
	}

	public PatientDetailsDTO(String patient_name, String doctor_name, String hospital_name) {
		super();
		this.patient_name = patient_name;
		this.doctor_name = doctor_name;
		this.hospital_name = hospital_name;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getHospital_name() {
		return hospital_name;
	}

	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}
	
	
	
	

}

package com.patient.patientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patient.patientservice.models.Patient;
import com.patient.patientservice.services.PatientService;

@RestController
@RequestMapping("/patient")
public class Controller {

	
	@Autowired
	private PatientService patientService;
	
	@PostMapping("/addPatient")
	public Object addPatient(@RequestBody Patient patient) {
		return patientService.addPatient(patient);
	}
	@GetMapping("/getPatient/{id}")
	public Object getPatient(@PathVariable Long id) {
		return patientService.getPatientDetails(id);
	}
	
}

package com.doctor.doctorservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.doctorservice.models.Doctor;
import com.doctor.doctorservice.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class Controller {

	
	@Autowired
	private DoctorService doctorService;
	
	
	@PostMapping("/addDoctor")
	public Object addDoctor(@RequestBody Doctor doctor) {
		return doctorService.addDoctor(doctor);
	}
	@GetMapping("/getDoctorAndHospital/{id}")
	public Object getDoctorDetails(@PathVariable Long id) {
		return doctorService.getDoctorDetails(id);
	}
	@GetMapping("/getOnlyDoctorInfo/{id}")
	public Object getOnlyDoctor(@PathVariable Long id) {
		return doctorService.getOnlyDoctorInfo(id);
	}
}

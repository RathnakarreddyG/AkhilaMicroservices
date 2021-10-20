package com.hospital.hospitalservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospitalservice.models.Hospital;
import com.hospital.hospitalservice.service.HospitalService;



@RestController
@RequestMapping("/hospital")
public class Controller {
	
	@Autowired
	private HospitalService hospitalService;

	@PostMapping("/addHospital")
	public Object addHospital(@RequestBody Hospital hospital) {
		return hospitalService.addHospital(hospital);
	}
	
	@GetMapping("/getHospital/{id}")
	public Object getHospital(@PathVariable Long id) {
		return hospitalService.getHospital(id);
	}
}

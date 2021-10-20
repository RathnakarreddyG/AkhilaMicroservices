package com.doctor.doctorservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.doctor.doctorservice.dao.Doctor_dao;
import com.doctor.doctorservice.models.Doctor;
import com.doctor.doctorservice.models.DoctorAndHostpital;
import com.doctor.doctorservice.models.HospitaDTO;

@Service
public class DoctorService {

	@Autowired
	private Doctor_dao doctor_dao;

	@Autowired
	private RestTemplate restTemplate;

	public Object addDoctor(Doctor doctor) {

		HospitaDTO hospitaDTO = restTemplate.getForObject(
				"http://hostpital-service/hospital/getHospital/" + doctor.getHospital_id(), HospitaDTO.class);
		
		if(hospitaDTO != null) {
			return doctor_dao.save(doctor);
		}else {
			return "Hostpital details not found";
		}
	}
	
	public Object getDoctorDetails(Long id) {
		Optional<Doctor> doctor = doctor_dao.findById(id);
		if(!doctor.isEmpty()) {
			HospitaDTO hospitaDTO = restTemplate.getForObject(
					"http://hostpital-service/hospital/getHospital/" + doctor.get().getHospital_id(), HospitaDTO.class);
			DoctorAndHostpital doctorAndHostpital = new DoctorAndHostpital();
			doctorAndHostpital.setDoctor(doctor.get());
			doctorAndHostpital.setHospitaDTO(hospitaDTO);
			
			return doctorAndHostpital;
		}else {
			return "Doctor details not found";
		}

	}
	public Object getOnlyDoctorInfo(Long id) {
		return doctor_dao.findById(id);
	}
}

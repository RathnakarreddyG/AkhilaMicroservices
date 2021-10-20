package com.patient.patientservice.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.patient.patientservice.dao.PatientDao;
import com.patient.patientservice.models.DoctorDTO;
import com.patient.patientservice.models.HostpitalDto;
import com.patient.patientservice.models.Patient;
import com.patient.patientservice.models.PatientDetailsDTO;

@Service
public class PatientService {

	@Autowired
	private PatientDao patientDao;

	@Autowired
	private RestTemplate restTemplate;

	public Object addPatient(Patient patient) {

		DoctorDTO doctorDTO = restTemplate.getForObject(
				"http://doctor-service/doctor/getOnlyDoctorInfo/" + patient.getDoctor_id(), DoctorDTO.class);
		if (doctorDTO != null) {
			return patientDao.save(patient);
		} else {
			return "Doctor details not found";
		}
	}

	public Object getPatientDetails(Long id) {
		Optional<Patient> patient = patientDao.findById(id);
		if (!patient.isEmpty()) {
			DoctorDTO doctorDTO = restTemplate.getForObject(
					"http://doctor-service/doctor/getOnlyDoctorInfo/" + patient.get().getDoctor_id(), DoctorDTO.class);
			HostpitalDto hostpitalDto = restTemplate.getForObject(
					"http://hostpital-service/hospital/getHospital/" + patient.get().getDoctor_id(),
					HostpitalDto.class);
			PatientDetailsDTO patientDetailsDTO = new PatientDetailsDTO(patient.get().getPatient_name(),
					doctorDTO.getDoctor_name(), hostpitalDto.getHospital_name());
			return patientDetailsDTO;

		} else {
			return "patient details not found";
		}

	}
}

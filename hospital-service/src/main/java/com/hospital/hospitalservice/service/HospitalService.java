package com.hospital.hospitalservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospitalservice.dao.Hospital_DAO;
import com.hospital.hospitalservice.models.Hospital;

@Service
public class HospitalService {
	
	
	@Autowired
	private Hospital_DAO hospital_DAO;
	
	
	public Object addHospital(Hospital hospital) {
		return hospital_DAO.save(hospital);
	}
	
	public Object getHospital(Long id) {
		return hospital_DAO.findById(id);
	}

}

package com.patient.patientservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.patientservice.models.Patient;

public interface PatientDao extends JpaRepository<Patient, Long> {

}

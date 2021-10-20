package com.doctor.doctorservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctor.doctorservice.models.Doctor;

public interface Doctor_dao extends JpaRepository<Doctor, Long> {

}

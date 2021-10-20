package com.hospital.hospitalservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.hospitalservice.models.Hospital;

public interface Hospital_DAO extends JpaRepository<Hospital, Long> {

}

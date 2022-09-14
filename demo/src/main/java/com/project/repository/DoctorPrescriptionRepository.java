package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bean.DoctorPrescription;

public interface DoctorPrescriptionRepository extends JpaRepository<DoctorPrescription, Integer> {

}

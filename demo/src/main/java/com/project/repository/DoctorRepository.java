package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bean.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}

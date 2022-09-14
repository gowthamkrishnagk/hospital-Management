package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bean.UserAppointment;

public interface UserAppointmentRepository extends JpaRepository<UserAppointment, Integer> {

}

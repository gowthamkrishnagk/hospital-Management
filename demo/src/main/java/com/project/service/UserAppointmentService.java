package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.User;
import com.project.bean.UserAppointment;
import com.project.repository.UserAppointmentRepository;

@Service
public class UserAppointmentService {
@Autowired
private UserAppointmentRepository appointment;



public UserAppointment addAppointment(UserAppointment apply) {
	return appointment.save(apply);
}
public List<UserAppointment> getAppointments(){
	return appointment.findAll();
}
public UserAppointment getUserbyid(int id) {
	 return appointment.findById(id).orElse(null);
	}
public String deleteUserAppontment(int id) {
	appointment.deleteById(id);
	return "UserAppointment Removed "+id;
}
public UserAppointment updateDoctor(UserAppointment userapp) {
	
	UserAppointment existingAppointment=appointment.findById(userapp.getAppointmentid()).orElse(null);
	existingAppointment.setPatientname(userapp.getPatientname());
	existingAppointment.setSymptoms(userapp.getSymptoms());
	existingAppointment.setDate(userapp.getDate());
	existingAppointment.setTime(userapp.getTime());
//	existingAppointment.setDoctor(userapp.getDoctor());
	return appointment.save(existingAppointment);
}
}

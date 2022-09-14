package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Doctor;
import com.project.repository.DoctorRepository;

@Service
public class DoctorService {
@Autowired
private DoctorRepository doctorrepository;

public Doctor saveDoctor(Doctor doctor) {
	return doctorrepository.save(doctor);
}
public List<Doctor> saveDoctors(List<Doctor> doctors){
	return doctorrepository.saveAll(doctors);
}
public List<Doctor> getDoctors(){
	return doctorrepository.findAll();
}
public String deleteDoctors(int doc_id) {
	doctorrepository.deleteById(doc_id);
	return "Doctor Removed "+doc_id;
}
public Doctor updateDoctor(Doctor doc) {
	Doctor existingDoctor=doctorrepository.findById(doc.getDoc_id()).orElse(null);
	existingDoctor.setName(doc.getName());
	existingDoctor.setDepartment(doc.getDepartment());
	return doctorrepository.save(existingDoctor);
}
}

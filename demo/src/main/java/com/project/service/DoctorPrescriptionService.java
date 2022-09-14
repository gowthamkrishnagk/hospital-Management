package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.DoctorPrescription;
import com.project.bean.UserAppointment;
import com.project.repository.DoctorPrescriptionRepository;

@Service
public class DoctorPrescriptionService {
@Autowired
private DoctorPrescriptionRepository prescription;


public DoctorPrescription addprescription(DoctorPrescription prescript) {
	return prescription.save(prescript);
}
public DoctorPrescription getprPrescriptionbyid(int id) {
	return prescription.findById(id).orElse(null);
}
public List<DoctorPrescription> getprPrescriptions(){
	return prescription.findAll();
}

public String deleteDoctorPrescription(int id) {
	prescription.deleteById(id);
	return "DoctorPrescription Removed "+id;
}

}

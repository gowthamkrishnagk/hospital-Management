package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.User;
import com.project.bean.UserAppointment;
import com.project.service.UserAppointmentService;
import com.project.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userservice;
    @Autowired
    private UserAppointmentService appointment;
    
public UserService getUserservice() {
	return userservice;
}
public void setUserservice(UserService userservice) {
	this.userservice = userservice;
}

@PostMapping("/user/signup")
public User signupUser(@RequestBody User user, Model model) {
	return userservice.addUser(user);
}
@GetMapping("/user/login")
public String loginUser() {
	return "welcome";
	
}
@PostMapping("/user/appointment")
public UserAppointment addAppointment(@RequestBody UserAppointment apply,Model model) {
	return appointment.addAppointment(apply);
	}
}

package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Doctor;
import com.project.bean.User;
import com.project.repository.UserRepository;
@Service
public class UserService {
@Autowired
private UserRepository userRepo;



public User addUser(User user) {
	return userRepo.save(user);
}
public User getUserbyid(int id) {
 return userRepo.findById(id).orElse(null);
}
public List<User> addUsers(List<User> users){
	return userRepo.saveAll(users);
}
public List<User> getUsers(){
	return userRepo.findAll();
}
public String deleteUsers(int id) {
	userRepo.deleteById(id);
	return "User Removed "+id;
}
public User updateDoctor(User user) {
	User existingUser=userRepo.findById(user.getId()).orElse(null);
	existingUser.setUserName(user.getUserName());
	existingUser.setEmail(user.getEmail());
	existingUser.setPhone(user.getPhone());
	existingUser.setDob(user.getDob());
	existingUser.setPassword(user.getPassword());
	return userRepo.save(existingUser);
}

}

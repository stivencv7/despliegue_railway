package com.evc.despliegue.railway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.evc.despliegue.railway.models.dao.UserDAO;
import com.evc.despliegue.railway.models.entity.User;

@CrossOrigin(originPatterns = "*")
@RestController
public class UserController {
	
	@Autowired
	private UserDAO service;
	
	@GetMapping("/")
	public List<User> getUsers(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable Long id){
		return service.findById(id).orElse(null);
	}
	
	@GetMapping("/add")
	public User addUser(){
		return service.save(new User(null,"nombre","apellido"));
	}

}

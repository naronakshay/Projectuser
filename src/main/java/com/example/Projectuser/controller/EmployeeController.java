package com.example.Projectuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Projectuser.dao.EmployeeRepo;
import com.example.Projectuser.model.Employee;
import com.example.Projectuser.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	
	private EmployeeService employeeService;
	@PostMapping ("/addemployee")
	public Employee addEmployee(@RequestBody Employee e ) {
		return employeeService.createEmployee(e);
	}
	
	@PostMapping("/addemployees")
	public List<Employee> addEmployees(@RequestBody List<Employee> e) {
		return employeeService.createEmployees(e);
	}
	
	@GetMapping("/Employee/{id}")
	public Employee getUserById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}

	@GetMapping("/users")
	public List<Employee> getAllUsers() {
		return employeeService.getEmployees();
	}

	@PutMapping("/updateuser")
	public Employee updateUser(@RequestBody Employee e) {
		return employeeService.updateUser(e);
	}

	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable int id) {
		return employeeService.deleteEmployeeById(id);
	}
	
	
	
	
	

}

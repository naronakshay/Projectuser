package com.example.Projectuser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Projectuser.dao.EmployeeRepo;
import com.example.Projectuser.model.Employee;


@Service
public class EmployeeService {

	
	@Autowired
	private   EmployeeRepo employeerepo;
	
	public  Employee createEmployee(Employee e) {
		
		return employeerepo.save(e);
	}

	public  List<Employee> createEmployees(List<Employee> e) {
		
		return employeerepo.saveAll(e);
	}

	public  Employee getEmployeeById(int id) {
		return employeerepo.findById(id).orElse(null);
	}

	public  List<Employee> getEmployees() {
		
		return employeerepo.findAll();
	}

	public  Employee updateUser(Employee e) {
		 
		Employee e1=null;
		java.util.Optional<Employee> optionalemlpoyee = employeerepo.findById(e.getId());
		
		if(optionalemlpoyee.isPresent()) {
			e1=optionalemlpoyee.get();
			e1.setName(e.getName());
			e1.setAddress(e.getAddress());
			employeerepo.save(e1);
		}
		else
		{
			return new Employee();
		}
		return e1;
		
	}

	public  String deleteEmployeeById(int id) {
		employeerepo.deleteById(id);
		return  "User got deleted";
	}



}

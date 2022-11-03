package com.example.Projectuser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Projectuser.model.Employee;

@Repository
public interface EmployeeRepo  extends JpaRepository<Employee,Integer>{
	
	 Employee findByName(String name);
}

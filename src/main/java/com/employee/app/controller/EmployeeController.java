package com.employee.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {

	@GetMapping
	public ResponseEntity<?> getEmployees(){
		return null;
	}
	
	@GetMapping("/{employee-id}")
	public ResponseEntity<?> getEmployee(@PathVariable("employee-id") Integer empId){
		return null;
	}
	
	@PutMapping("/{employee-id}")
	public ResponseEntity<?> updateEmployee(@PathVariable("employee-id") Integer empId){
		return null;
	}
	
	@DeleteMapping("/{employee-id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable("employee-id") Integer empId){
		return null;
	}
	
	@PostMapping
	public ResponseEntity<?> addEmployee(){
		return null;
	}
}

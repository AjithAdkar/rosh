package com.ajith.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ajith.requstbody.NewEmp;
import com.ajith.service.EmployeService;

@RestController
public class EmployeControler {
	@Autowired
	EmployeService service;

	@PostMapping("/addemp")
	void addemp(@RequestBody NewEmp emp) {
		System.out.println(emp);
		service.save(emp);
	}

}

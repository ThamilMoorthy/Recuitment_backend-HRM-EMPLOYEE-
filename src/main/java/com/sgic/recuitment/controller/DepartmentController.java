package com.sgic.recuitment.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.recuitment.entity.Department;
import com.sgic.recuitment.service.DepartmentService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/department")
	public HttpStatus createDepartment(@Valid @RequestBody Department department) {
		boolean test = departmentService.addDepartment(department);
		if (test) {
			return HttpStatus.CREATED;

		}

		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/department")
	public ResponseEntity<List<Department>> getDepartment() {
		List<Department> department = departmentService.getAllDepartment();
		ResponseEntity<List<Department>> response = new ResponseEntity<>(department, HttpStatus.OK);
		return response;
	}

	@GetMapping("/department/{id}")
	public Department getOneById(@PathVariable("id") Integer department_id) {
		return departmentService.getById(department_id);
	}

	@PutMapping("/department/{id}")
	public HttpStatus editDepartment(@RequestBody Department department, @PathVariable("id") Integer department_id) {
		boolean test = departmentService.editDepartment(department, department_id);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;

	}

	@DeleteMapping("/department/{id}")
	public HttpStatus deleteDeparment(@PathVariable("id") Integer department_id) {
		boolean test = departmentService.deleteDepartment(department_id);
		HttpStatus status;
		if (test) {
			return HttpStatus.OK;
		} else {
			status = HttpStatus.BAD_REQUEST;
		}
		return status;
	}

}

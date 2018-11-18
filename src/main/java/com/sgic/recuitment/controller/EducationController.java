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

import com.sgic.recuitment.entity.Education;
import com.sgic.recuitment.service.EducationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class EducationController {

	@Autowired
	private EducationService educationService;

	@PostMapping("/education")
	public HttpStatus createEducation(@Valid @RequestBody Education education) {
		boolean test = educationService.addEducationt(education);
		if (test) {
			return HttpStatus.CREATED;

		}

		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/education")
	public ResponseEntity<List<Education>> getEducation() {
		List<Education> education = educationService.getAllEducation();
		ResponseEntity<List<Education>> response = new ResponseEntity<>(education, HttpStatus.OK);
		return response;
	}

	@GetMapping("/education/{id}")
	public Education getOneById(@PathVariable("id") Integer education_Id) {
		return educationService.getById(education_Id);
	}

	@PutMapping("/education/{id}")
	public HttpStatus editEducation(@RequestBody Education education, @PathVariable("id") Integer education_Id) {
		boolean test = educationService.editEducation(education, education_Id);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;

	}

	@DeleteMapping("/education/{id}")
	public HttpStatus deleteEducation(@PathVariable("id") Integer education_Id) {
		boolean test = educationService.deleteEducation(education_Id);
		HttpStatus status;
		if (test) {
			return HttpStatus.OK;
		} else {
			status = HttpStatus.BAD_REQUEST;
		}
		return status;
	}

}

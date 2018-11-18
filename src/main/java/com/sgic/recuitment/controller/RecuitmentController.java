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
import com.sgic.recuitment.entity.Recuitment;
import com.sgic.recuitment.service.RecuitmentService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
public class RecuitmentController {
	@Autowired
	private RecuitmentService recuitmentService;

	@PostMapping("/recuitment")
	public HttpStatus createRecuitment(@Valid @RequestBody Recuitment recuitment) {
		boolean test = recuitmentService.addRecuitment(recuitment);
		if (test) {
			return HttpStatus.CREATED;

		}

		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/recuitment")
	public ResponseEntity<List<Recuitment>> getRecuitment() {
		List<Recuitment> recuitment = recuitmentService.getAllRecuitment();
		ResponseEntity<List<Recuitment>> response = new ResponseEntity<>(recuitment, HttpStatus.OK);
		return response;
	}

	@GetMapping("/recuitment/{id}")
	public Recuitment getOneById(@PathVariable("id") Integer recuitment_type_id) {
		return recuitmentService.getById(recuitment_type_id);
	}

	@PutMapping("/recuitment/{id}")
	public HttpStatus editDepartment(@RequestBody Recuitment recuitment, @PathVariable("id") Integer recuitment_type_id) {
		boolean test = recuitmentService.editRecuitment(recuitment, recuitment_type_id);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;

	}

	@DeleteMapping("/recuitment/{id}")
	public HttpStatus deleteJob(@PathVariable("id") Integer job_id) {
		boolean test = recuitmentService.deleteRecuitment(job_id);
		HttpStatus status;
		if (test) {
			return HttpStatus.OK;
		} else {
			status = HttpStatus.BAD_REQUEST;
		}
		return status;
	}

}

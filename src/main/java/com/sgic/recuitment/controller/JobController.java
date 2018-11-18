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
import com.sgic.recuitment.entity.Job;
import com.sgic.recuitment.service.JobService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
public class JobController {

	@Autowired
	private JobService jobService;

	
	@PostMapping("/job")
	public HttpStatus createDepartment(@Valid @RequestBody Job job) {
		boolean test = jobService.addJob(job);
		if (test) {
			return HttpStatus.CREATED;

		}

		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/job")
	public ResponseEntity<List<Job>> getJob() {
		List<Job> job = jobService.getAllJob();
		ResponseEntity<List<Job>> response = new ResponseEntity<>(job, HttpStatus.OK);
		return response;
	}

	@GetMapping("/job/{id}")
	public Job getOneById(@PathVariable("id") Integer job_id) {
		return jobService.getById(job_id);
	}

	@PutMapping("/job/{id}")
	public HttpStatus editDepartment(@RequestBody Job job, @PathVariable("id") Integer job_id) {
		boolean test = jobService.editJob(job, job_id);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;

	}

	@DeleteMapping("/job/{id}")
	public HttpStatus deleteJob(@PathVariable("id") Integer job_id) {
		boolean test = jobService.deleteJob(job_id);
		HttpStatus status;
		if (test) {
			return HttpStatus.OK;
		} else {
			status = HttpStatus.BAD_REQUEST;
		}
		return status;
	}

}

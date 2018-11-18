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
import com.sgic.recuitment.entity.JobRoleTemplate;
import com.sgic.recuitment.service.JobRoleTemplateService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class JobRoleTemplateController {

	@Autowired
	private JobRoleTemplateService jobRoleTemplateService;
	
	@PostMapping("/jobRoleTemplate")
	public HttpStatus createJobRoleTemplate(@Valid @RequestBody JobRoleTemplate jobRoleTemplate) {
		boolean test = jobRoleTemplateService.addJobRoleTemplate(jobRoleTemplate);
		if (test) {
			return HttpStatus.CREATED;

		}

		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/jobRoleTemplate")
	public ResponseEntity<List<JobRoleTemplate>> getJobRoleTemplate() {
		List<JobRoleTemplate> jobRoleTemplate = jobRoleTemplateService.getAllJobRoleTemplate();
		ResponseEntity<List<JobRoleTemplate>> response = new ResponseEntity<>(jobRoleTemplate, HttpStatus.OK);
		return response;
	}

	@GetMapping("/jobRoleTemplate/{id}")
	public JobRoleTemplate getOneById(@PathVariable("id") Integer job_role_template_id) {
		return jobRoleTemplateService.getById(job_role_template_id);
	}

	@PutMapping("/jobRoleTemplate/{id}")
	public HttpStatus editJobRoleTemplate(@RequestBody JobRoleTemplate jobRoleTemplate, @PathVariable("id") Integer job_role_template_id) {
		boolean test = jobRoleTemplateService.editJobRoleTemplate(jobRoleTemplate, job_role_template_id);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;

	}

	@DeleteMapping("/jobRoleTemplate/{id}")
	public HttpStatus deleteJobRoleTemplate(@PathVariable("id") Integer job_role_template_id) {
		boolean test = jobRoleTemplateService.deleteJobRoleTemplate(job_role_template_id);
		HttpStatus status;
		if (test) {
			return HttpStatus.OK;
		} else {
			status = HttpStatus.BAD_REQUEST;
		}
		return status;
	}

}

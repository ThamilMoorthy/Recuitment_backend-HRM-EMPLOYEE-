package com.sgic.recuitment.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.recuitment.entity.Vacancy;
import com.sgic.recuitment.service.VacancyService;

@RestController
public class VacancyController {
	@Autowired
	private VacancyService vacancyService;
	
	
	@PostMapping("/vacancy")
	public HttpStatus createVacancy(@Valid @RequestBody Vacancy vacancy) {
		boolean test = vacancyService.addVacancy(vacancy);
		if (test) {
			return HttpStatus.CREATED;

		}

		return HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/vacancy")
	public ResponseEntity<List<Vacancy>> getVacancy() {
		List<Vacancy> vacancy = vacancyService.getAllVacancy();
		ResponseEntity<List<Vacancy>> response = new ResponseEntity<>(vacancy, HttpStatus.OK);
		return response;
	}

	@GetMapping("/vacancy/{id}")
	public Vacancy getOneById(@PathVariable("id") Integer vacancy_id) {
		return vacancyService.getById(vacancy_id);
	}

	@PutMapping("/vacancy/{id}")
	public HttpStatus editDepartment(@RequestBody Vacancy vacancy, @PathVariable("id") Integer vacancy_id) {
		boolean test = vacancyService.editVacancy(vacancy, vacancy_id);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;

	}

	@DeleteMapping("/vacancy/{id}")
	public HttpStatus deleteVacancy(@PathVariable("id") Integer vacancy_id) {
		boolean test = vacancyService.deleteVacancy(vacancy_id);
		HttpStatus status;
		if (test) {
			return HttpStatus.OK;
		} else {
			status = HttpStatus.BAD_REQUEST;
		}
		return status;
	}
}

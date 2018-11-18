package com.sgic.recuitment.service;

import java.util.List;

import com.sgic.recuitment.entity.Vacancy;


public interface VacancyService {
	 boolean addVacancy(Vacancy vacancy);
	 
	   List<Vacancy> getAllVacancy();
	   
	   boolean editVacancy(Vacancy vacancy, Integer vacancy_id);
	   
	   boolean deleteVacancy(Integer vacancy_id);
	   
	   Vacancy getById(Integer vacancy_id);
}

package com.sgic.recuitment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.recuitment.entity.Vacancy;
import com.sgic.recuitment.repositort.VacancyRepository;

@Service
public class VacancyServiceImpl implements VacancyService {
	@Autowired
	private VacancyRepository vacancyRepository;
	
	@Override
	public boolean addVacancy(Vacancy vacancy) {
		vacancyRepository.save(vacancy);
		return true;
	}

	@Override
	public List<Vacancy> getAllVacancy() {
		return vacancyRepository.findAll();
	}

	@Override
	public boolean editVacancy(Vacancy vacancy, Integer vacancy_id) {
		boolean success = false;
		if (vacancyRepository.getOne(vacancy_id) != null) {
			vacancy.setVacancy_id(vacancy_id);
			vacancyRepository.save(vacancy);
			success = true;
			return success;
		}
		return success;
	}

	@Override
	public boolean deleteVacancy(Integer vacancy_id) {
		Vacancy vacancy = vacancyRepository.getOne(vacancy_id);
		if (vacancy.getVacancy_id() == (vacancy_id)) {
			vacancyRepository.deleteById(vacancy_id);
			return true;
		}
		return false;
	}



	@Override
	public Vacancy getById(Integer vacancy_id) {
		return vacancyRepository.getOne(vacancy_id);
	}

}

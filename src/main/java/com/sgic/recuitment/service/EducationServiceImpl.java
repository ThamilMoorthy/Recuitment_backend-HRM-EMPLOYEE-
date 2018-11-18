package com.sgic.recuitment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.recuitment.entity.Education;
import com.sgic.recuitment.repositort.EducationRepository;

@Service
public class EducationServiceImpl implements EducationService{
	@Autowired
	private EducationRepository educationRepository;

	
	@Override
	public boolean addEducationt(Education education) {
		educationRepository.save(education);
		return true;
	}

	@Override
	public List<Education> getAllEducation() {
		return educationRepository.findAll();
	}

	@Override
	public boolean editEducation(Education education, Integer education_id) {
		boolean success = false;
		if (educationRepository.getOne(education_id) != null) {
			education.setEducation_id(education_id);
			educationRepository.save(education);
			success = true;
			return success;
		}
		return success;
	}

	@Override
	public boolean deleteEducation(Integer education_id) {
		Education education = educationRepository.getOne(education_id);
		if (education.getEducation_id() == (education_id)) {
			educationRepository.deleteById(education_id);
			return true;
		}
		return false;
	}

	@Override
	public Education getById(Integer education_id) {
		return educationRepository.getOne(education_id);
	}

}

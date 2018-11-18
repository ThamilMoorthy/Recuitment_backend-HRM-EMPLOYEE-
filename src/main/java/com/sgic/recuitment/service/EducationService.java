package com.sgic.recuitment.service;

import java.util.List;
import com.sgic.recuitment.entity.Education;

public interface EducationService {

	boolean addEducationt(Education education);

	List<Education> getAllEducation();

	boolean editEducation(Education education, Integer education_Id);

	boolean deleteEducation(Integer education_Id);

	Education getById(Integer education_Id);
}

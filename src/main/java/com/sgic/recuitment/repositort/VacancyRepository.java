package com.sgic.recuitment.repositort;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.recuitment.entity.Vacancy;

public interface VacancyRepository  extends JpaRepository<Vacancy, Integer>{

}

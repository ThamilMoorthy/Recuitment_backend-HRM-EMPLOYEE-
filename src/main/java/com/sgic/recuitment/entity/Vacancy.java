package com.sgic.recuitment.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema="recuitment", name="vacancy")
public class Vacancy implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3585060208327222010L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer vacancy_id;
	private String hiring_officer;
	private Integer no_of_vacancy;
	private Integer salary_scale;
	private ZonedDateTime vacancy_open_date;
	private ZonedDateTime vacancy_close_date;
	private ZonedDateTime interview_date;
	private String key_recuitment;

	@ManyToOne
	@JoinColumn(name = "job_job_id")
	private Job job_id;

	@ManyToOne
	@JoinColumn(name = "department_department_id")
	private Department hiring_department_id;

	@ManyToOne
	@JoinColumn(name = "recuitment_recuitment_type_id")
	private Recuitment recuitment_type_id;

	public Integer getVacancy_id() {
		return vacancy_id;
	}

	public void setVacancy_id(Integer vacancy_id) {
		this.vacancy_id = vacancy_id;
	}



	public String getHiring_officer() {
		return hiring_officer;
	}

	public void setHiring_officer(String hiring_officer) {
		this.hiring_officer = hiring_officer;
	}

	public Integer getNo_of_vacancy() {
		return no_of_vacancy;
	}

	public void setNo_of_vacancy(Integer no_of_vacancy) {
		this.no_of_vacancy = no_of_vacancy;
	}

	public Integer getSalary_scale() {
		return salary_scale;
	}

	public void setSalary_scale(Integer salary_scale) {
		this.salary_scale = salary_scale;
	}

	

	public ZonedDateTime getVacancy_open_date() {
		return vacancy_open_date;
	}

	public void setVacancy_open_date(ZonedDateTime vacancy_open_date) {
		this.vacancy_open_date = vacancy_open_date;
	}

	public ZonedDateTime getVacancy_close_date() {
		return vacancy_close_date;
	}

	public void setVacancy_close_date(ZonedDateTime vacancy_close_date) {
		this.vacancy_close_date = vacancy_close_date;
	}

	public ZonedDateTime getInterview_date() {
		return interview_date;
	}

	public void setInterview_date(ZonedDateTime interview_date) {
		this.interview_date = interview_date;
	}

	
	public String getKey_recuitment() {
		return key_recuitment;
	}

	public void setKey_recuitment(String key_recuitment) {
		this.key_recuitment = key_recuitment;
	}

	public Job getJob_id() {
		return job_id;
	}

	public void setJob_id(Job job_id) {
		this.job_id = job_id;
	}

	public Department getHiring_department_id() {
		return hiring_department_id;
	}

	public void setHiring_department_id(Department hiring_department_id) {
		this.hiring_department_id = hiring_department_id;
	}

	public Recuitment getRecuitment_type_id() {
		return recuitment_type_id;
	}

	public void setRecuitment_type_id(Recuitment recuitment_type_id) {
		this.recuitment_type_id = recuitment_type_id;
	}

}

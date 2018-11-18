package com.sgic.recuitment.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "recuitment", name = "job-role-template")
public class JobRoleTemplate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4828592998526899245L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer job_role_template_id;
	private String overView;
	private String responsibility;
	private String experience;
	private String specific_skill;
	private String licences;
	private String physical_ability;
	private String personal_cheracteristics;
	private String certification;

	@ManyToOne
	@JoinColumn(name = "job_job_id")
	private Job job_id;

	@ManyToOne
	@JoinColumn(name = "education_education_id")
	private Education education_id;

	public Integer getJob_role_template_id() {
		return job_role_template_id;
	}

	public void setJob_role_template_id(Integer job_role_template_id) {
		this.job_role_template_id = job_role_template_id;
	}

	public String getOverView() {
		return overView;
	}

	public void setOverView(String overView) {
		this.overView = overView;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getSpecific_skill() {
		return specific_skill;
	}

	public void setSpecific_skill(String specific_skill) {
		this.specific_skill = specific_skill;
	}

	public String getLicences() {
		return licences;
	}

	public void setLicences(String licences) {
		this.licences = licences;
	}

	public String getPhysical_ability() {
		return physical_ability;
	}

	public void setPhysical_ability(String physical_ability) {
		this.physical_ability = physical_ability;
	}

	public String getPersonal_cheracteristics() {
		return personal_cheracteristics;
	}

	public void setPersonal_cheracteristics(String personal_cheracteristics) {
		this.personal_cheracteristics = personal_cheracteristics;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public Job getJob_id() {
		return job_id;
	}

	public void setJob_id(Job job_id) {
		this.job_id = job_id;
	}

	public Education getEducation_id() {
		return education_id;
	}

	public void setEducation_id(Education education_id) {
		this.education_id = education_id;
	}

	
}

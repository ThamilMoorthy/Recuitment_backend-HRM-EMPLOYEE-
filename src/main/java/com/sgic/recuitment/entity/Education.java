package com.sgic.recuitment.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "recuitment", name = "education")
public class Education implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = -338394696014621096L;
	@Id
	private Integer education_id;
	private String education_Type;

	

	public Integer getEducation_id() {
		return education_id;
	}

	public void setEducation_id(Integer education_id) {
		this.education_id = education_id;
	}

	public String getEducation_Type() {
		return education_Type;
	}

	public void setEducation_Type(String education_Type) {
		this.education_Type = education_Type;
	}

}

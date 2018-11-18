package com.sgic.recuitment.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="recuitment", name="job")
public class Job implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 6031616970448216414L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer job_id;
	private String job;
	private Integer reference_no;

	public Integer getJob_id() {
		return job_id;
	}

	public void setJob_id(Integer job_id) {
		this.job_id = job_id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getReference_no() {
		return reference_no;
	}

	public void setReference_no(Integer reference_no) {
		this.reference_no = reference_no;
	}

	

}

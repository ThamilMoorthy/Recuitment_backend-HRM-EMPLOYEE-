package com.sgic.recuitment.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="recuitment", name="department")
public class Department implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = -3216690043840518023L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer department_id;
	private String hiring_department;

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public String getHiring_department() {
		return hiring_department;
	}

	public void setHiring_department(String hiring_department) {
		this.hiring_department = hiring_department;
	}

	

}

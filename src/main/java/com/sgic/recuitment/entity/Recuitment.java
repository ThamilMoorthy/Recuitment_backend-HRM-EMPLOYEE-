package com.sgic.recuitment.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="recuitment", name="recuitment")
public class Recuitment implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = -3273099251093322214L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer recuitment_type_id;
	private String recuitment_type_name;
	
	public Integer getRecuitment_type_id() {
		return recuitment_type_id;
	}
	public void setRecuitment_type_id(Integer recuitment_type_id) {
		this.recuitment_type_id = recuitment_type_id;
	}
	public String getRecuitment_type_name() {
		return recuitment_type_name;
	}
	public void setRecuitment_type_name(String recuitment_type_name) {
		this.recuitment_type_name = recuitment_type_name;
	}



	
}

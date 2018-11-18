package com.sgic.recuitment.service;

import java.util.List;
import com.sgic.recuitment.entity.Recuitment;


public interface RecuitmentService {
	  boolean addRecuitment(Recuitment recuitment);
	  
	   List<Recuitment> getAllRecuitment();
	   
	   boolean editRecuitment(Recuitment recuitment, Integer recuitment_type_id);
	   
	   boolean deleteRecuitment(Integer recuitment_type_id);
	   
	   Recuitment getById(Integer recuitment_type_id);
}

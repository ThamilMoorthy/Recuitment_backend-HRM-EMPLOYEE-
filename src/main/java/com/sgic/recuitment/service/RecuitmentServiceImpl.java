package com.sgic.recuitment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.recuitment.entity.Recuitment;
import com.sgic.recuitment.repositort.RecuitmentRepository;

@Service
public class RecuitmentServiceImpl implements RecuitmentService{
	@Autowired
	private RecuitmentRepository recuitmentRepository;

	@Override
	public boolean addRecuitment(Recuitment recuitment) {
		recuitmentRepository.save(recuitment);
		return true;
	}

	@Override
	public List<Recuitment> getAllRecuitment() {
		return recuitmentRepository.findAll();
	}

	@Override
	public boolean editRecuitment(Recuitment recuitment, Integer recuitment_type_id) {
		boolean success = false;
		if (recuitmentRepository.getOne(recuitment_type_id) != null) {
			recuitment.setRecuitment_type_id(recuitment_type_id);
			recuitmentRepository.save(recuitment);
			success = true;
			return success;
		}
		return success;
	}

	@Override
	public boolean deleteRecuitment(Integer recuitment_type_id) {
		Recuitment recuitment = recuitmentRepository.getOne(recuitment_type_id);
		if (recuitment.getRecuitment_type_id() == (recuitment_type_id)) {
			recuitmentRepository.deleteById(recuitment_type_id);
			return true;
		}
		return false;
	}

	@Override
	public Recuitment getById(Integer recuitment_type_id) {
		return recuitmentRepository.getOne(recuitment_type_id);
	}

}

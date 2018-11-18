package com.sgic.recuitment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.recuitment.entity.Department;
import com.sgic.recuitment.repositort.DepartmentRepository;


@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public boolean addDepartment(Department department) {
		departmentRepository.save(department);
		return true;
	}

	@Override
	public java.util.List<Department> getAllDepartment() {
		return departmentRepository.findAll();
	}


	@Override
	public boolean editDepartment(Department department, Integer department_id) {
		boolean success = false;
		if (departmentRepository.getOne(department_id) != null) {
			department.setDepartment_id(department_id);
			departmentRepository.save(department);
			success = true;
			return success;
		}
		return success;
	}

	@Override
	public boolean deleteDepartment(Integer department_id) {
		Department department = departmentRepository.getOne(department_id);
		if (department.getDepartment_id() == (department_id)) {
			departmentRepository.deleteById(department_id);
			return true;
		}
		return false;
	}

	@Override
	public Department getById(Integer department_id) {
		return departmentRepository.getOne(department_id);
	}

	


	
	

	

}

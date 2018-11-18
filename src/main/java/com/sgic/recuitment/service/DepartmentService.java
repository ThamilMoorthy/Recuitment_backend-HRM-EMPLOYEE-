package com.sgic.recuitment.service;

import java.util.List;
import com.sgic.recuitment.entity.Department;

public interface DepartmentService {
	
	  boolean addDepartment(Department department);
	  
	   List<Department> getAllDepartment();
	   
	   boolean editDepartment(Department department, Integer department_id);
	   
	   boolean deleteDepartment(Integer department_id);
	   
	   Department getById(Integer department_id);
}

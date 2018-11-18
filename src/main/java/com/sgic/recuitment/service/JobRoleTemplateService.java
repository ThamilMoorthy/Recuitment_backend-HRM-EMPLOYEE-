package com.sgic.recuitment.service;

import java.util.List;
import com.sgic.recuitment.entity.JobRoleTemplate;

public interface JobRoleTemplateService {
	 boolean addJobRoleTemplate(JobRoleTemplate jobRoleTemplate);
	  
	   List<JobRoleTemplate> getAllJobRoleTemplate();
	   
	   boolean editJobRoleTemplate(JobRoleTemplate jobRoleTemplate, Integer job_role_template_id);
	   
	   boolean deleteJobRoleTemplate(Integer job_role_template_id);
	   
	   JobRoleTemplate getById(Integer job_role_template_id);
}

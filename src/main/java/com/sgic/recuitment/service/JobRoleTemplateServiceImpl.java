package com.sgic.recuitment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.recuitment.entity.JobRoleTemplate;
import com.sgic.recuitment.repositort.JobRoleTemplateRepository;

@Service
public class JobRoleTemplateServiceImpl implements JobRoleTemplateService {
	@Autowired
	private JobRoleTemplateRepository jobRoleTemplateRepository;

	@Override
	public boolean addJobRoleTemplate(JobRoleTemplate jobRoleTemplate) {
		jobRoleTemplateRepository.save(jobRoleTemplate);
		return true;
	}

	@Override
	public List<JobRoleTemplate> getAllJobRoleTemplate() {
		return jobRoleTemplateRepository.findAll();
	}

	@Override
	public boolean editJobRoleTemplate(JobRoleTemplate jobRoleTemplate, Integer job_role_template_id) {
		boolean success = false;
		if (jobRoleTemplateRepository.getOne(job_role_template_id) != null) {
			jobRoleTemplate.setJob_role_template_id(job_role_template_id);
			jobRoleTemplateRepository.save(jobRoleTemplate);
			success = true;
			return success;
		}
		return success;
	}

	@Override
	public boolean deleteJobRoleTemplate(Integer job_role_template_id) {
		JobRoleTemplate jobRoleTemplate = jobRoleTemplateRepository.getOne(job_role_template_id);
		if (jobRoleTemplate.getJob_role_template_id() == (job_role_template_id)) {
			jobRoleTemplateRepository.deleteById(job_role_template_id);
			return true;
		}
		return false;
	}

	@Override
	public JobRoleTemplate getById(Integer job_role_template_id) {
		return jobRoleTemplateRepository.getOne(job_role_template_id);
	}

}

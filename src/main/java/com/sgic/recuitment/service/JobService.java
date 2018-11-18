package com.sgic.recuitment.service;

import java.util.List;
import com.sgic.recuitment.entity.Job;

public interface JobService {
	
	 boolean addJob(Job job);
	 
	   List<Job> getAllJob();
	   
	   boolean editJob(Job job, Integer job_id);
	   
	   boolean deleteJob(Integer job_id);
	   
	   Job getById(Integer job_id);
}

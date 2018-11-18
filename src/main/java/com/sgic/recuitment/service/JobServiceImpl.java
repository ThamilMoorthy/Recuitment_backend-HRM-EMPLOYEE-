package com.sgic.recuitment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.recuitment.entity.Job;
import com.sgic.recuitment.repositort.JobRepository;

@Service
public class JobServiceImpl implements JobService{
	
	@Autowired
	private JobRepository jobRepository;
	
	@Override
	public boolean addJob(Job job) {
		jobRepository.save(job);
		return true;
	}

	@Override
	public List<Job> getAllJob() {
		return jobRepository.findAll();
	}

	@Override
	public boolean editJob(Job job, Integer job_id) {
		boolean success = false;
		if (jobRepository.getOne(job_id) != null) {
			job.setJob_id(job_id);
			jobRepository.save(job);
			success = true;
			return success;
		}
		return success;
	}

	@Override
	public boolean deleteJob(Integer job_id) {
		Job job = jobRepository.getOne(job_id);
		if (job.getJob_id() == (job_id)) {
			jobRepository.deleteById(job_id);
			return true;
		}
		return false;
	}

	@Override
	public Job getById(Integer job_id) {
		return jobRepository.getOne(job_id);
	}
	

}

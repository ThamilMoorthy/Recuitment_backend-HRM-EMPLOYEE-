package com.sgic.recuitment.repositort;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sgic.recuitment.entity.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {

}

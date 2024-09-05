package com.babar.jobhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.babar.jobhub.entity.Job;

public interface JobRepository extends JpaRepository<Job,Long>{

}

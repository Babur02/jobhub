package com.babar.jobhub.service;

import java.util.List;

import com.babar.jobhub.entity.Job;

public interface JobService {

    List<Job> findJobs();
    void createJob(Job job);
    Job getJobById(Long id);
    boolean deleteJobById(Long id);
    boolean updateJob(Long id, Job updatedJob);
}

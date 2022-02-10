package com.my_project.service;

import com.my_project.dto.JobDto;
import com.my_project.entity.Job;
import com.my_project.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    private JobRepository jobRepository;

    @Override
    public Job saveJob(JobDto jobDto) {
        return jobRepository.save(jobBuilder(jobDto));
    }

    @Override
    @Transactional
    public List<Job> getListOfUsers() {
        List<Job> all = jobRepository.findAll();
        List<Job> all2 = new ArrayList<>();

        return all2;
    }

    public Job jobBuilder (JobDto dto){
        return Job.builder().nameOfJob(dto.getNameOfJob()).build();
    }

}

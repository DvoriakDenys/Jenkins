package com.my_project.controller;

import com.my_project.dto.JobDto;
import com.my_project.entity.Job;
import com.my_project.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class JobController {
    @Autowired
    JobService jobService;

    public Job saveJob (JobDto jobDto){
        return jobService.saveJob(jobDto);
    }
}

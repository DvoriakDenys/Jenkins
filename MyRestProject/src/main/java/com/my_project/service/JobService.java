package com.my_project.service;

import com.my_project.dto.JobDto;
import com.my_project.entity.Job;

import java.util.List;

public interface JobService {
    Job saveJob (JobDto jobDto);

    List<Job> getListOfUsers ();
}

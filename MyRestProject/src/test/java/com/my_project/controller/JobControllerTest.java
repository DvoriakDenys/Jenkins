package com.my_project.controller;

import com.my_project.dto.JobDto;
import com.my_project.entity.Job;
import com.my_project.service.JobServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Log4j2
@SpringBootTest
class JobControllerTest {

    @Autowired
    JobController jobController;
    @Autowired
    JobServiceImpl jobService;

    JobDto jobDto = JobDto.builder().nameOfJob("Teacher").build();

    @Test
    void saveJob() {
        Job job = jobController.saveJob(jobDto);
        log.info("Save job {}", job);
    }

    @Test
    void getAll (){
        List<Job> listOfUsers = jobService.getListOfUsers();
        log.info("Get all users {}" , listOfUsers );
    }


}
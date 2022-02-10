package com.my_project.service;

import com.my_project.dto.JobDto;
import com.my_project.dto.UserDto;
import com.my_project.entity.Job;
import com.my_project.entity.User;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@Log4j2
@SpringBootTest
@WebMvcTest
class UserServiceImplTest {
    @Autowired
    UserService userService;

    @Autowired
    MockMvc mockMvc;

    JobDto job = JobDto.builder().nameOfJob("Programist").build();
    Job random = Job.builder().nameOfJob("Teacher").id(2L).build();
    UserDto userDto = UserDto.builder().age(22).name("Test").car("car").job(random).build();
    User user = User.builder().name(userDto.getName()).age(userDto.getAge()).build();
    User testUser;

    @Test
    void createUser() {
//        Mockito.when(userService.createUser(userDto)).thenReturn(user);
//        assertEquals(user.getAge(), 12);
//        assertEquals(user.getName(), "Test");
        testUser = userService.createUser(userDto);
        log.info("User created {}", testUser);
    }

    @Test
    void updateUser() {
        testUser = userService.updateUser(userDto);
        log.info("User update  {}", testUser);
    }

    @Test
    void findUser() {
        testUser = userService.findById(1L);
        log.info("Find user {}", testUser);
    }

    @Test
    void deleteUser() {
        userService.deleteUser(userDto);
        Mockito.verify(userService, Mockito.times(1)).deleteUser(userDto);
    }
}
package com.my_project.controller;

import com.my_project.dto.UserDto;
import com.my_project.entity.User;
import com.my_project.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/create")
    public User createUser(){
        UserDto userDto = new UserDto();
        return userService.createUser(userDto);
    }

    @PutMapping(value = "/update/{id}")
    public User updateUser(@RequestPart UserDto userDto){
        return userService.updateUser(userDto);
    }

    @DeleteMapping(value = "/delete")
    public void deleteUser (UserDto userDto){
        userService.deleteUser(userDto);
    }

    @GetMapping(value = "/get/{id}")
    public User findUser (@PathVariable Long id){
        return userService.findById(id);
    }
}

package com.my_project.service;


import com.my_project.dto.UserDto;
import com.my_project.entity.User;

public interface UserService {

    User createUser(UserDto userDto);

    User updateUser(UserDto userDto);

    void deleteUser(UserDto userDto);

    User findById(Long id);
}

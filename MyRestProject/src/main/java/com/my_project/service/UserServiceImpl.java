package com.my_project.service;

import com.my_project.dto.UserDto;
import com.my_project.entity.User;
import com.my_project.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(UserDto userDto) {
        log.info("userDto: {}", userDto);
        String s;
        List<String> list = new ArrayList<>();
        return userRepository.save(builderUser(userDto));
    }

    public User updateUser(UserDto userDto) {
        log.info("userDto: {}", userDto);
        return userRepository.save(builderUser(userDto));
    }

    public void deleteUser(UserDto userDto) {
        userRepository.delete(builderUser(userDto));
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public User builderUser(UserDto userDto){
        return User.builder()
                .age(userDto.getAge())
                .id(userDto.getId())
                .name(userDto.getName())
                .car(userDto.getCar())
                .job(userDto.getJob())
                .build();
    }
}

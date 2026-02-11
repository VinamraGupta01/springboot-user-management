package com.springboot.usermanagement.mapper;

import org.springframework.stereotype.Component;

import com.springboot.usermanagement.dto.UserDto;
import com.springboot.usermanagement.entity.User;

@Component
public class UserMapper {

    public UserDto toDto(User user) {
        return new UserDto(
            user.getId(),
            user.getFirstName(),
            user.getLastName(),
            user.getEmail()
        );
    }

    public User toEntity(UserDto userDto) {
        return new User(
            userDto.firstName(),
            userDto.lastName(),
            userDto.email()
        );
    }
}

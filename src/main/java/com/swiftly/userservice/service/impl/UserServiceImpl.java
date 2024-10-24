package com.swiftly.userservice.service.impl;

import com.swiftly.userservice.dto.UserDto;
import com.swiftly.userservice.dto.UserLoginDto;
import com.swiftly.userservice.dto.UserUpdateDto;
import com.swiftly.userservice.models.enums.Role;
import com.swiftly.userservice.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public Long registerUser(UserDto userDto) {
        return null;
    }

    @Override
    public String loginUser(UserLoginDto userDto) {
        return null;
    }

    @Override
    public String logoutUser(String token) {
        return null;
    }

    @Override
    public UserDto getUserDetails(Long userId) {
        return null;
    }

    @Override
    public String updateUserDetails(Long userId, UserUpdateDto userDto) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }


    @Override
    public Role getRoleOfUser(Long userId) {
        return null;
    }

    @Override
    public String updateRoleOfUser(Long userId, Role role) {
        return null;
    }
}

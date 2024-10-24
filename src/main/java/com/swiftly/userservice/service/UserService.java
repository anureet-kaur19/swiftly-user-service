package com.swiftly.userservice.service;

import com.swiftly.userservice.dto.UserDto;
import com.swiftly.userservice.dto.UserLoginDto;
import com.swiftly.userservice.dto.UserUpdateDto;
import com.swiftly.userservice.models.enums.Role;

public interface UserService {

    Long registerUser(UserDto userDto);

    String loginUser(UserLoginDto userDto);

    String logoutUser(String token);

    UserDto getUserDetails(Long userId);

    String updateUserDetails(Long userId, UserUpdateDto userDto);

    void deleteUser(Long userId);

    Role getRoleOfUser(Long userId);

    String updateRoleOfUser(Long userId, Role role);

}

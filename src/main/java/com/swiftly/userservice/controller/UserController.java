package com.swiftly.userservice.controller;

import com.swiftly.userservice.dto.UserDto;
import com.swiftly.userservice.dto.UserLoginDto;
import com.swiftly.userservice.dto.UserUpdateDto;
import com.swiftly.userservice.models.enums.Role;
import com.swiftly.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // User registration
    @PostMapping("/register")
    public ResponseEntity<Long> registerUser(@RequestBody UserDto userDTO) {
        Long createdUserId = userService.registerUser(userDTO);
        return new ResponseEntity<>(createdUserId, HttpStatus.CREATED);
    }

    // User login
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody UserLoginDto loginRequest) {
        String token = userService.loginUser(loginRequest);
        return ResponseEntity.ok(token);
    }

    // User logout
    @PostMapping("/logout")
    public ResponseEntity<String> logoutUser(String token) {
        String message = userService.logoutUser(token);
        return ResponseEntity.ok(message);
    }

    // Fetch user details
    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUserDetails(@PathVariable Long userId) {
        UserDto user = userService.getUserDetails(userId);
        return ResponseEntity.ok(user);
    }

    // Update user information
    @PutMapping("/{userId}")
    public ResponseEntity<String> updateUserDetails(@PathVariable Long userId,
                                              @RequestBody UserUpdateDto userDTO) {
        String updatedUser = userService.updateUserDetails(userId, userDTO);
        return ResponseEntity.ok(updatedUser);
    }

    // Delete a user account.
    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }

    // Get role of user
    @GetMapping("/{userId}/role")
    public ResponseEntity<Role> getRoleOfUser(@PathVariable Long userId) {
        Role role = userService.getRoleOfUser(userId);
        return ResponseEntity.ok(role);
    }

    // Update role to user profile
    @PutMapping("/{userId}/roles")
    public ResponseEntity<String> updateRoleOfUser(@PathVariable Long userId,
                                                   @PathVariable Role role) {
        String message = userService.updateRoleOfUser(userId, role);
        return ResponseEntity.ok(message);
    }
}


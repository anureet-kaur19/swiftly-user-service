package com.swiftly.userservice.dto;


import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateDto {
    
    @Email
    private String email;
    
    private String password;
    
    private String firstName;
    
    private String lastName;

    private String role;

}


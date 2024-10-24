package com.swiftly.userservice.models.enums;

import lombok.Getter;

@Getter
public enum Role {
    CUSTOMER("Customer"),
    ADMIN("Admin");

    private final String role;

    Role(String role) {this.role = role; }

}


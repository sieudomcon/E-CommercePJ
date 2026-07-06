package com.evstation.ecommerceapi.User;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class User {
    private String id;
    private String email;
    private String passwordHash;
    private String fullName;
    private LocalDateTime createdAt;
    private boolean isActive = true;
}

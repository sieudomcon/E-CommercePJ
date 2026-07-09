package com.evstation.ecommerceapi.Category;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Category {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
}

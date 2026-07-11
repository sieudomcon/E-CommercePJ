package com.evstation.ecommerceapi.User;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "User ID is required")
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @NotBlank(message = "Recipient name is required")
    @Size(max = 100, message = "Recipient name must not exceed 100 characters")
    @Column(nullable = false, length = 100)
    private String recipientName;

    @NotBlank(message = "Phone number is required")
    @Pattern(
            regexp = "^0\\d{9}$",
            message = "Invalid phone number"
    )
    @Column(nullable = false, length = 10)
    private String phone;

    @NotBlank(message = "Province is required")
    @Size(max = 100)
    @Column(nullable = false, length = 100)
    private String province;

    @NotBlank(message = "District is required")
    @Size(max = 100)
    @Column(nullable = false, length = 100)
    private String district;

    @NotBlank(message = "Ward is required")
    @Size(max = 100)
    @Column(nullable = false, length = 100)
    private String ward;

    @NotBlank(message = "Street address is required")
    @Size(max = 255)
    @Column(nullable = false, length = 255)
    private String streetAddress;

    @Column(nullable = false)
    private boolean isDefault = false;
}

package com.evstation.ecommerceapi.Address;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private Long id;
    private String userId;
    private String recipient_name;
    private String phone;
    private String province;
    private String district;
    private String ward;
    private String streetAddress;
    private Boolean isDefault = false;
}

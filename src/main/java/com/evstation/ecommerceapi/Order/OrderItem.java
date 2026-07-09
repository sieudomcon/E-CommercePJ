package com.evstation.ecommerceapi.OrderItem;

import java.math.BigDecimal;

public class OrderItem {
    private Long id;
    private Long orderId;
    private Long productVariantId;
    private String productName;
    private String variantName;
    private BigDecimal price;
    private Integer quantity;
}

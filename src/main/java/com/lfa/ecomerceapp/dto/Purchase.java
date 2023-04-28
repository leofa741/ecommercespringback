package com.lfa.ecomerceapp.dto;

import com.lfa.ecomerceapp.entity.Address;
import com.lfa.ecomerceapp.entity.Customer;
import com.lfa.ecomerceapp.entity.Order;
import com.lfa.ecomerceapp.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;


}

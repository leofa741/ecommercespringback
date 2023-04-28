package com.lfa.ecomerceapp.service;

import com.lfa.ecomerceapp.dto.Purchase;
import com.lfa.ecomerceapp.dto.PurchaseResponse;


public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}

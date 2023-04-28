package com.lfa.ecomerceapp.controller;


import com.lfa.ecomerceapp.dto.Purchase;
import com.lfa.ecomerceapp.dto.PurchaseResponse;
import com.lfa.ecomerceapp.service.CheckoutService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

     @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        return purchaseResponse;


     }

}

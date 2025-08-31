package com.BillingSoftware.BillingSoftware.controller;

import com.BillingSoftware.BillingSoftware.io.OrderResponse;
import com.BillingSoftware.BillingSoftware.io.PaymentRequest;
import com.BillingSoftware.BillingSoftware.io.PaymentVerificationRequest;
import com.BillingSoftware.BillingSoftware.io.RazorpayOrderResponse;
import com.BillingSoftware.BillingSoftware.service.OrderService;
import com.BillingSoftware.BillingSoftware.service.RazorpayService;
import com.razorpay.RazorpayException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final RazorpayService razorpayService;
    private final OrderService orderService;

    @PostMapping("/create-order")
    @ResponseStatus(HttpStatus.CREATED)
    public RazorpayOrderResponse createRazorpayOrder(@RequestBody PaymentRequest request) throws RazorpayException{
        return razorpayService.createOrder(request.getAmount(), request.getCurrency());
    }

    @PostMapping("/verify")
    public OrderResponse verifyPayment(@RequestBody PaymentVerificationRequest request){
        return orderService.verifyPayment(request);
    }
}


package com.BillingSoftware.BillingSoftware.service;

import com.BillingSoftware.BillingSoftware.io.RazorpayOrderResponse;
import com.razorpay.RazorpayException;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}

package com.BillingSoftware.BillingSoftware.service;

import com.BillingSoftware.BillingSoftware.io.OrderRequest;
import com.BillingSoftware.BillingSoftware.io.OrderResponse;
import com.BillingSoftware.BillingSoftware.io.PaymentVerificationRequest;

import java.util.List;

public interface OrderService {

    OrderResponse createOrder(OrderRequest request);

    void deleteOrder(String orderId);

    List<OrderResponse> getLatestOrders();

    OrderResponse verifyPayment(PaymentVerificationRequest request);
}

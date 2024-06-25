package com.zosh.service;

import com.stripe.exception.StripeException;
import com.zosh.Response.PaymentResponse;
import com.zosh.model.Order;

public interface PaymentService{

    public PaymentResponse createPaymentLink(Order order) throws StripeException;
}

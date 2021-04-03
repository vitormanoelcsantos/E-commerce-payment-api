package com.one.innovation.digital.service;


import com.one.innovation.digital.entity.PaymentEntity;
import com.one.innovation.digital.event.CheckoutCreatedEvent;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}

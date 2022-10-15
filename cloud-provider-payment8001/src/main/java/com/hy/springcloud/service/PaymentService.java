package com.hy.springcloud.service;

import com.hy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author HAIYUE
 */
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

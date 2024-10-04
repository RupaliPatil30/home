package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Service;


import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.PaymentProcessingDTO;

import java.util.List;

public interface PaymentProcessingService {
    PaymentProcessingDTO savePaymentProcessing(PaymentProcessingDTO paymentProcessingDTO);
    List<PaymentProcessingDTO> getAllPayments();
    PaymentProcessingDTO getPaymentById(Long id);
    void deletePayment(Long id);
}


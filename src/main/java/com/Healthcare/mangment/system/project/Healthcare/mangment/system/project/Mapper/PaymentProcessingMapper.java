package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Mapper;



import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity.PaymentProcessing;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.PaymentProcessingDTO;

import org.springframework.stereotype.Component;

@Component
public class PaymentProcessingMapper {

    public PaymentProcessingDTO toDto(PaymentProcessing paymentProcessing) {
        if (paymentProcessing == null) {
            return null;
        }

        PaymentProcessingDTO paymentProcessingDTO = new PaymentProcessingDTO();
        paymentProcessingDTO.setId(paymentProcessing.getId());
        paymentProcessingDTO.setPatientId(paymentProcessing.getPatientId());
        paymentProcessingDTO.setAmount(paymentProcessing.getAmount());
        paymentProcessingDTO.setPaymentDate(paymentProcessing.getPaymentDate());
        paymentProcessingDTO.setStatus(paymentProcessing.getStatus());
        paymentProcessingDTO.setDescription(paymentProcessing.getDescription());

        return paymentProcessingDTO;
    }

    public PaymentProcessing toEntity(PaymentProcessingDTO paymentProcessingDTO) {
        if (paymentProcessingDTO == null) {
            return null;
        }

        PaymentProcessing paymentProcessing = new PaymentProcessing();
        paymentProcessing.setId(paymentProcessingDTO.getId());
        paymentProcessing.setPatientId(paymentProcessingDTO.getPatientId());
        paymentProcessing.setAmount(paymentProcessingDTO.getAmount());
        paymentProcessing.setPaymentDate(paymentProcessingDTO.getPaymentDate());
        paymentProcessing.setStatus(paymentProcessingDTO.getStatus());
        paymentProcessing.setDescription(paymentProcessingDTO.getDescription());

        return paymentProcessing;
    }
}

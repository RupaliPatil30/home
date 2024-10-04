package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.serviceimpl;

import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Mapper.PaymentProcessingMapper;

import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity.PaymentProcessing;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Repository.PaymentProcessingRepository;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Service.PaymentProcessingService;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.PaymentProcessingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentProcessingServiceImpl implements PaymentProcessingService {

    @Autowired
    private PaymentProcessingRepository paymentProcessingRepository;

    @Autowired
    private PaymentProcessingMapper paymentProcessingMapper;

    @Override
    public PaymentProcessingDTO savePaymentProcessing(PaymentProcessingDTO paymentProcessingDTO) {
        PaymentProcessing paymentProcessing = paymentProcessingMapper.toEntity(paymentProcessingDTO);
        PaymentProcessing savedPaymentProcessing = paymentProcessingRepository.save(paymentProcessing);
        return paymentProcessingMapper.toDto(savedPaymentProcessing);
    }

    @Override
    public List<PaymentProcessingDTO> getAllPayments() {
        return paymentProcessingRepository.findAll().stream()
                .map(paymentProcessingMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public PaymentProcessingDTO getPaymentById(Long id) {
        return paymentProcessingRepository.findById(id)
                .map(paymentProcessingMapper::toDto)
                .orElse(null);
    }

    @Override
    public void deletePayment(Long id) {
        paymentProcessingRepository.deleteById(id);
    }
}

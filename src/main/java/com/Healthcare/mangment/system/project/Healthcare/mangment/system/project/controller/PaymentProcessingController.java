package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.controller;

import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Service.PaymentProcessingService;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.PaymentProcessingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentProcessingController {

    @Autowired
    private PaymentProcessingService paymentProcessingService;

    @PostMapping
    public ResponseEntity<PaymentProcessingDTO> createPayment(@RequestBody PaymentProcessingDTO paymentProcessingDTO) {
        PaymentProcessingDTO savedPayment = paymentProcessingService.savePaymentProcessing(paymentProcessingDTO);
        return ResponseEntity.ok(savedPayment);
    }

    @GetMapping
    public ResponseEntity<List<PaymentProcessingDTO>> getAllPayments() {
        List<PaymentProcessingDTO> payments = paymentProcessingService.getAllPayments();
        return ResponseEntity.ok(payments);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaymentProcessingDTO> getPaymentById(@PathVariable Long id) {
        PaymentProcessingDTO payment = paymentProcessingService.getPaymentById(id);
        return payment != null ? ResponseEntity.ok(payment) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable Long id) {
        paymentProcessingService.deletePayment(id);
        return ResponseEntity.noContent().build();
    }
}


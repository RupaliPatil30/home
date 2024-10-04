package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.controller;



import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Service.PatientBillingService;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.PatientBillingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/billings")
public class PatientBillingController {

    @Autowired
    private PatientBillingService patientBillingService;

    @PostMapping
    public ResponseEntity<PatientBillingDTO> createPatientBilling(@RequestBody PatientBillingDTO billingDTO) {
        PatientBillingDTO savedBilling = patientBillingService.savePatientBilling(billingDTO);
        return ResponseEntity.ok(savedBilling);
    }

    @GetMapping
    public ResponseEntity<List<PatientBillingDTO>> getAllBillings() {
        List<PatientBillingDTO> billings = patientBillingService.getAllBillings();
        return ResponseEntity.ok(billings);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PatientBillingDTO> getBillingById(@PathVariable Long id) {
        PatientBillingDTO billing = patientBillingService.getBillingById(id);
        if (billing != null) {
            return ResponseEntity.ok(billing);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBilling(@PathVariable Long id) {
        patientBillingService.deleteBilling(id);
        return ResponseEntity.noContent().build();
    }
}

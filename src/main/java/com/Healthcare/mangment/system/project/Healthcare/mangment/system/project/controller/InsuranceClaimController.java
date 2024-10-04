package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.controller;




import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Service.InsuranceClaimService;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.InsuranceClaimDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/insurance-claims")
public class InsuranceClaimController {

    @Autowired
    private InsuranceClaimService insuranceClaimService;

    @PostMapping
    public ResponseEntity<InsuranceClaimDTO> createInsuranceClaim(@RequestBody InsuranceClaimDTO insuranceClaimDTO) {
        InsuranceClaimDTO savedInsuranceClaim = insuranceClaimService.saveInsuranceClaim(insuranceClaimDTO);
        return ResponseEntity.ok(savedInsuranceClaim);
    }

    @GetMapping
    public ResponseEntity<List<InsuranceClaimDTO>> getAllInsuranceClaims() {
        List<InsuranceClaimDTO> insuranceClaims = insuranceClaimService.getAllInsuranceClaims();
        return ResponseEntity.ok(insuranceClaims);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InsuranceClaimDTO> getInsuranceClaimById(@PathVariable Long id) {
        InsuranceClaimDTO insuranceClaim = insuranceClaimService.getInsuranceClaimById(id);
        if (insuranceClaim != null) {
            return ResponseEntity.ok(insuranceClaim);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInsuranceClaim(@PathVariable Long id) {
        insuranceClaimService.deleteInsuranceClaim(id);
        return ResponseEntity.noContent().build();
    }
}

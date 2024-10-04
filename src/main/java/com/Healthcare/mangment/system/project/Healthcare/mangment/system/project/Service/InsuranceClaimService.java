package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Service;

import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.InsuranceClaimDTO;

import java.util.List;


public interface InsuranceClaimService {
    InsuranceClaimDTO saveInsuranceClaim(InsuranceClaimDTO insuranceClaimDTO);
    List<InsuranceClaimDTO> getAllInsuranceClaims();
    InsuranceClaimDTO getInsuranceClaimById(Long id);
    void deleteInsuranceClaim(Long id);
}


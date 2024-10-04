package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Mapper;

import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity.InsuranceClaim;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.InsuranceClaimDTO;


import org.springframework.stereotype.Component;

@Component
public class InsuranceClaimMapper {

    public InsuranceClaimDTO toDto(InsuranceClaim insuranceClaim) {
        if (insuranceClaim == null) {
            return null;
        }

        InsuranceClaimDTO insuranceClaimDTO = new InsuranceClaimDTO();
        insuranceClaimDTO.setId(insuranceClaim.getId());
        insuranceClaimDTO.setPatientId(insuranceClaim.getPatientId());
        insuranceClaimDTO.setClaimAmount(insuranceClaim.getClaimAmount());
        insuranceClaimDTO.setClaimDate(insuranceClaim.getClaimDate());
        insuranceClaimDTO.setStatus(insuranceClaim.getStatus());
        insuranceClaimDTO.setDescription(insuranceClaim.getDescription());

        return insuranceClaimDTO;
    }

    public InsuranceClaim toEntity(InsuranceClaimDTO insuranceClaimDTO) {
        if (insuranceClaimDTO == null) {
            return null;
        }

        InsuranceClaim insuranceClaim = new InsuranceClaim();
        insuranceClaim.setId(insuranceClaimDTO.getId());
        insuranceClaim.setPatientId(insuranceClaimDTO.getPatientId());
        insuranceClaim.setClaimAmount(insuranceClaimDTO.getClaimAmount());
        insuranceClaim.setClaimDate(insuranceClaimDTO.getClaimDate());
        insuranceClaim.setStatus(insuranceClaimDTO.getStatus());
        insuranceClaim.setDescription(insuranceClaimDTO.getDescription());

        return insuranceClaim;
    }
}

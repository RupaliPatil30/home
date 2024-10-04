package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.serviceimpl;


import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity.InsuranceClaim;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Mapper.InsuranceClaimMapper;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Repository.InsuranceClaimRepository;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Service.InsuranceClaimService;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.InsuranceClaimDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InsuranceClaimServiceImpl implements InsuranceClaimService {

    @Autowired
    private InsuranceClaimRepository insuranceClaimRepository;

    @Autowired
    private InsuranceClaimMapper insuranceClaimMapper;

    @Override
    public InsuranceClaimDTO saveInsuranceClaim(InsuranceClaimDTO insuranceClaimDTO) {
        InsuranceClaim insuranceClaim = insuranceClaimMapper.toEntity(insuranceClaimDTO);
        InsuranceClaim savedInsuranceClaim = insuranceClaimRepository.save(insuranceClaim);
        return insuranceClaimMapper.toDto(savedInsuranceClaim);
    }



    @Override
    public List<InsuranceClaimDTO> getAllInsuranceClaims() {
        return insuranceClaimRepository.findAll().stream()
                .map(insuranceClaimMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public InsuranceClaimDTO getInsuranceClaimById(Long id) {
        return insuranceClaimRepository.findById(id)
                .map(insuranceClaimMapper::toDto)
                .orElse(null);
    }

    @Override
    public void deleteInsuranceClaim(Long id) {
        insuranceClaimRepository.deleteById(id);
    }
}


package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.serviceimpl;


import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity.PatientBilling;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Mapper.PatientBillingMapper;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Repository.PatientBillingRepository;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Service.PatientBillingService;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.PatientBillingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientBillingServiceImpl implements PatientBillingService {

    @Autowired
    private PatientBillingRepository patientBillingRepository;

    @Autowired
    private  PatientBillingMapper patientBillingMapper;




    @Override
    public PatientBillingDTO savePatientBilling(PatientBillingDTO billingDTO) {
        PatientBilling billing = patientBillingMapper.toEntity(billingDTO);
        PatientBilling savedBilling = patientBillingRepository.save(billing);
        return patientBillingMapper.toDto(savedBilling);
    }

    @Override
    public List<PatientBillingDTO> getAllBillings() {
        return patientBillingRepository.findAll().stream()
                .map(patientBillingMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public PatientBillingDTO getBillingById(Long id) {
        return patientBillingRepository.findById(id)
                .map(patientBillingMapper::toDto)
                .orElse(null);
    }

    @Override
    public void deleteBilling(Long id) {
        patientBillingRepository.deleteById(id);
    }
}





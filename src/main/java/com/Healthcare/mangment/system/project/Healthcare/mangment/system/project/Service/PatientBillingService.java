package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Service;


import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.PatientBillingDTO;

import java.util.List;

public interface PatientBillingService {

    PatientBillingDTO savePatientBilling(PatientBillingDTO billingDTO);

    List<PatientBillingDTO> getAllBillings();

    PatientBillingDTO getBillingById(Long id);

    void deleteBilling(Long id);
}


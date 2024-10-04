package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Service;


import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.PatientDTO;

import java.util.List;

public interface PatientService {
    PatientDTO createPatient(PatientDTO patientDTO);
    PatientDTO getPatientById(Long id);
    List<PatientDTO> getAllPatients();
    PatientDTO updatePatient(Long id, PatientDTO patientDTO);
    void deletePatient(Long id);
}


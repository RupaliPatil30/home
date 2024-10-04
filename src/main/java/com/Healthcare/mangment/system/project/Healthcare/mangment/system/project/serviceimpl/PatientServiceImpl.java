package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.serviceimpl;




import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity.Patient;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Repository.PatientRepository;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Service.PatientService;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.PatientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<PatientDTO> getAllPatients() {
        return patientRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PatientDTO getPatientById(Long id) {
        Optional<Patient> patient = patientRepository.findById(id);
        return patient.map(this::convertToDTO).orElse(null);
    }

    @Override
    public PatientDTO createPatient(PatientDTO patientDTO) {
        Patient patient = convertToEntity(patientDTO);
        Patient savedPatient = patientRepository.save(patient);
        return convertToDTO(savedPatient);
    }

    @Override
    public PatientDTO updatePatient(Long id, PatientDTO patientDTO) {
        if (!patientRepository.existsById(id)) {
            return null;
        }
        Patient patient = convertToEntity(patientDTO);
        patient.setId(id);
        Patient updatedPatient = patientRepository.save(patient);
        return convertToDTO(updatedPatient);
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

    private PatientDTO convertToDTO(Patient patient) {
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setId(patient.getId());
        patientDTO.setFirstName(patient.getFirstName());
        patientDTO.setLastName(patient.getLastName());
        patientDTO.setDateOfBirth(patient.getDateOfBirth());
        patientDTO.setGender(patient.getGender());
        patientDTO.setContactNumber(patient.getContactNumber());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setAddress(patient.getAddress());
        return patientDTO;
    }

    private Patient convertToEntity(PatientDTO patientDTO) {
        Patient patient = new Patient();
        patient.setFirstName(patientDTO.getFirstName());
        patient.setLastName(patientDTO.getLastName());
        patient.setDateOfBirth(patientDTO.getDateOfBirth());
        patient.setGender(patientDTO.getGender());
        patient.setContactNumber(patientDTO.getContactNumber());
        patient.setEmail(patientDTO.getEmail());
        patient.setAddress(patientDTO.getAddress());
        return patient;
    }
}

package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.serviceimpl;



import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity.Doctor;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity.DoctorSchedule;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Repository.DoctorRepository;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Service.DoctorService;

import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Exception.ResourceNotFoundException;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.DoctorDTO;
import org.apache.catalina.Session;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorServiceImpl<DoctorSchedule> implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;
    private Store doctorScheduleRepository;

    @Override
    public DoctorDTO createDoctor(DoctorDTO doctorDTO) {
        Doctor doctor = mapToEntity(doctorDTO);
        doctor = doctorRepository.save(doctor);
        return mapToDTO(doctor);
    }

    @Override
    public DoctorDTO getDoctorById(Long id) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id: " + id));
        return mapToDTO(doctor);
    }

    @Override
    public List<DoctorDTO> getAllDoctors() {
        List<Doctor> doctors = doctorRepository.findAll();
        return doctors.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public DoctorDTO updateDoctor(Long id, DoctorDTO doctorDTO) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id: " + id));
        doctor.setName(doctorDTO.getName());
        doctor.setSpecialty(doctorDTO.getSpecialty());
        doctor.setQualifications(doctorDTO.getQualifications());
        doctor.setContactInfo(doctorDTO.getContactInfo());
        doctor = doctorRepository.save(doctor);
        return mapToDTO(doctor);
    }

    @Override
    public void deleteDoctor(Long id) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id: " + id));
        doctorRepository.delete(doctor);
    }

    @Override
    public List<DoctorDTO> searchDoctors(String name, String specialty) {
        List<Doctor> doctors;
        if (name != null && specialty != null) {
            doctors = doctorRepository.findByNameContainingAndSpecialtyContaining(name, specialty);
        } else if (name != null) {
            doctors = doctorRepository.findByNameContaining(name);
        } else if (specialty != null) {
            doctors = doctorRepository.findBySpecialtyContaining(specialty);
        } else {
            doctors = doctorRepository.findAll();
        }
        return doctors.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    private DoctorDTO mapToDTO(Doctor doctor) {
        DoctorDTO dto = new DoctorDTO();
        dto.setId(doctor.getId());
        dto.setName(doctor.getName());
        dto.setSpecialty(doctor.getSpecialty());
        dto.setQualifications(doctor.getQualifications());
        dto.setContactInfo(doctor.getContactInfo());
        return dto;
    }

    private Doctor mapToEntity(DoctorDTO dto) {
        Doctor doctor = new Doctor();
        doctor.setId(dto.getId());
        doctor.setName(dto.getName());
        doctor.setSpecialty(dto.getSpecialty());
        doctor.setQualifications(dto.getQualifications());
        doctor.setContactInfo(dto.getContactInfo());
        return doctor;
    }
}



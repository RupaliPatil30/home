package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Service;


import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.DoctorDTO;

import java.util.List;

public interface DoctorService {
    DoctorDTO createDoctor(DoctorDTO doctorDTO);
    DoctorDTO getDoctorById(Long id);
    List<DoctorDTO> getAllDoctors();
    DoctorDTO updateDoctor(Long id, DoctorDTO doctorDTO);
    void deleteDoctor(Long id);
    List<DoctorDTO> searchDoctors(String name, String specialty);
}

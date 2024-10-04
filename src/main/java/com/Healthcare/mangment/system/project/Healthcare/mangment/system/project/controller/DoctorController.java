package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.controller;

import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Service.DoctorService;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.DoctorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    // Get all doctors
    @GetMapping
    public ResponseEntity<List<DoctorDTO>> getAllDoctors() {
        List<DoctorDTO> doctors = doctorService.getAllDoctors();
        return ResponseEntity.ok(doctors);
    }

    // Get a doctor by ID
    @GetMapping("/{id}")
    public ResponseEntity<DoctorDTO> getDoctorById(@PathVariable Long id) {
        DoctorDTO doctor = doctorService.getDoctorById(id);
        return doctor != null ? ResponseEntity.ok(doctor) : ResponseEntity.notFound().build();
    }

    // Create a new doctor
    @PostMapping
    public ResponseEntity<DoctorDTO> createDoctor(@RequestBody DoctorDTO doctorDTO) {
        DoctorDTO createdDoctor = doctorService.createDoctor(doctorDTO);
        return ResponseEntity.status(201).body(createdDoctor);
    }

    // Update an existing doctor
    @PutMapping("/{id}")
    public ResponseEntity<DoctorDTO> updateDoctor(@PathVariable Long id, @RequestBody DoctorDTO doctorDTO) {
        DoctorDTO updatedDoctor = doctorService.updateDoctor(id, doctorDTO);
        return updatedDoctor != null ? ResponseEntity.ok(updatedDoctor) : ResponseEntity.notFound().build();
    }

    // Delete a doctor
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDoctor(@PathVariable Long id) {
        doctorService.deleteDoctor(id);
        return ResponseEntity.noContent().build();
    }

    // Search doctors by name and/or specialty
    @GetMapping("/search")
    public ResponseEntity<List<DoctorDTO>> searchDoctors(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String specialty) {
        List<DoctorDTO> doctors = doctorService.searchDoctors(name, specialty);
        return ResponseEntity.ok(doctors);
    }
}


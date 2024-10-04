package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Repository;



import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    List<Doctor> findByNameContainingAndSpecialtyContaining(String name, String specialty);

    List<Doctor> findByNameContaining(String name);

    List<Doctor> findBySpecialtyContaining(String specialty);
}


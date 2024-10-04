package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Repository;


import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity.PatientBilling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientBillingRepository extends JpaRepository<PatientBilling, Long> {
    // Custom query methods can be added here if needed
    //  List<PatientBilling> findByPatientId(Long patientId);
    //    List<PatientBilling> findByStatus(String status);
}

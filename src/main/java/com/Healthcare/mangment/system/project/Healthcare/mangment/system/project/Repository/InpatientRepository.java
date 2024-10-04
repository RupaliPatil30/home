package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Repository;

import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity.Inpatient;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity.InsuranceClaim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InpatientRepository extends JpaRepository<Inpatient, Long> {
    interface InsuranceClaimRepository extends JpaRepository<InsuranceClaim, Long> {
}
}

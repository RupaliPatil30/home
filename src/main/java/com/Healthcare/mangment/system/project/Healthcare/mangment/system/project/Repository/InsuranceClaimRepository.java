package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Repository;




import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity.InsuranceClaim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceClaimRepository extends JpaRepository<InsuranceClaim, Long> {
}

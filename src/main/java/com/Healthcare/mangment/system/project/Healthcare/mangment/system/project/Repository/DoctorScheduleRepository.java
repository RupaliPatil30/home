package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Repository;

import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity.DoctorSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorScheduleRepository extends JpaRepository<DoctorSchedule, Long> {
    // Custom query methods can be added here if needed
}


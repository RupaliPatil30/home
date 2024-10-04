package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Repository;


import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
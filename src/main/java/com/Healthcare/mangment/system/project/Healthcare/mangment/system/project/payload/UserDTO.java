package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload;

import java.util.Set;

public class UserDTO {
    private Long id;
    private String username;
    private boolean enabled;
    private Set<RoleDTO> roles;

    // Constructors, getters, and setters

    public UserDTO() {}

    public UserDTO(Long id, String username, boolean enabled, Set<RoleDTO> roles) {
        this.id = id;
        this.username = username;
        this.enabled = enabled;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleDTO> roles) {
        this.roles = roles;
    }
}


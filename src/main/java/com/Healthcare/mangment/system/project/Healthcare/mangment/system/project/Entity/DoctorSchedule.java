package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class DoctorSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    @Column(nullable = false)
    private LocalDateTime scheduleDate;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDateTime getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(LocalDateTime scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public LocalDateTime getStartTime() {
        return getStartTime();
    }

    public LocalDateTime getEndTime() {
        return getEndTime();
    }

    public void setStartTime(LocalDateTime startTime) {
    }

    public void setEndTime(LocalDateTime endTime) {
    }


    // Optionally, you can add toString(), equals(), and hashCode() methods for better debugging and object comparison
}

package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity;




import jakarta.persistence.*;

import java.util.Date;

@Entity
public class PatientRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private Date visitDate;
    private String diagnosis;
    private String treatment;
    private String doctorName;

    // Getters and Setters
}


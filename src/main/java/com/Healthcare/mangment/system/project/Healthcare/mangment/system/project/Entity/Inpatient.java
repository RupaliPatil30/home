package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity;



import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Inpatient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private Date admissionDate;
    private Date dischargeDate;
    private String ward;
    private String bed;
    private String attendingDoctor;

    // Getters and Setters
}


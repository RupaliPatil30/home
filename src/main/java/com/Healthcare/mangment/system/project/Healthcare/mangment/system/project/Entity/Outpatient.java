package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity;



import jakarta.persistence.*;



@Entity
public class Outpatient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private String department;
    private String doctorName;
    private String visitReason;

    // Getters and Setters
}


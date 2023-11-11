package com.api.guiloker.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @CreationTimestamp
    private Instant createdAt;

    @UpdateTimestamp
    private Instant updatedAt;

    private String studentEmail;

    private String grr;

    private String fullName;

    private LocalDate birthdate;

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void setGrr(String grr) {
        this.grr = grr;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}

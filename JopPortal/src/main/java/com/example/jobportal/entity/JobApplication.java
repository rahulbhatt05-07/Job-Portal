package com.example.jobportal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="applications")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long jobId;
    private Long candidateId;
    @Column(length = 1000)
    private String coverLetter;

    private String status = "APPLIED"; // APPLIED, REVIEWED, REJECTED, HIRED

    private LocalDateTime appliedAt = LocalDateTime.now();

}

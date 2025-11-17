package com.example.jobportal.service;

import com.example.jobportal.entity.JobApplication;
import com.example.jobportal.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {

    private final JobApplicationRepository repo;

    public ApplicationService(JobApplicationRepository repo) {
        this.repo = repo;
    }

    public JobApplication apply(JobApplication app) {
        return repo.save(app);
    }

    public List<JobApplication> findByCandidate(Long id) {
        return repo.findByCandidateId(id);
    }

    public List<JobApplication> findByJob(Long id) {
        return repo.findByJobId(id);
    }

    public Optional<JobApplication> get(Long id) {
        return repo.findById(id);
    }

    public JobApplication update(JobApplication app) {
        return repo.save(app);
    }
}

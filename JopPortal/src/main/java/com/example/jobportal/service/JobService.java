package com.example.jobportal.service;

import com.example.jobportal.entity.Job;
import com.example.jobportal.repository.JobRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    private final JobRepository jobRepo;

    public JobService(JobRepository jobRepo) {
        this.jobRepo = jobRepo;
    }

    public Job create(Job job) { return jobRepo.save(job); }

    public List<Job> listAll() { return jobRepo.findAll(); }

    public Optional<Job> get(Long id) { return jobRepo.findById(id); }

    public void delete(Long id) { jobRepo.deleteById(id); }

    public List<Job> search(String q) {
        return jobRepo.findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(q, q);
    }

    public List<Job> findByEmployer(Long employerId) {
        return jobRepo.findByEmployerId(employerId);
    }
}

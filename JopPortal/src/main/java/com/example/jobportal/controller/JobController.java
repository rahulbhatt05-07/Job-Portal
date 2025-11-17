package com.example.jobportal.controller;

import com.example.jobportal.entity.Job;
import com.example.jobportal.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private final JobService jobService;
    public JobController(JobService jobService) { this.jobService = jobService; }

    @GetMapping
    public List<Job> list(@RequestParam(required = false) String q) {
        return (q != null && !q.isBlank()) ? jobService.search(q) : jobService.listAll();
    }

    @PostMapping
    public Job create(@RequestBody Job job) {
        return jobService.create(job);
    }

    @GetMapping("/{id}")
    public Optional<Job> get(@PathVariable Long id) {
        return jobService.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        jobService.delete(id);
    }
}

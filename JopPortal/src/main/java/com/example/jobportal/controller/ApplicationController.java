package com.example.jobportal.controller;

import com.example.jobportal.entity.JobApplication;
import com.example.jobportal.service.ApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping
    public JobApplication apply(@RequestBody JobApplication application) {
        return applicationService.apply(application);
    }

    @GetMapping("/candidate/{candidateId}")
    public List<JobApplication> getByCandidate(@PathVariable Long candidateId) {
        return applicationService.findByCandidate(candidateId);
    }

    @GetMapping("/job/{jobId}")
    public List<JobApplication> getByJob(@PathVariable Long jobId) {
        return applicationService.findByJob(jobId);
    }

    @PutMapping("/{id}/status")
    public JobApplication updateStatus(@PathVariable Long id, @RequestParam String status) {
        Optional<JobApplication> opt = applicationService.get(id);

        if (opt.isEmpty()) {
            throw new RuntimeException("Application not found!");
        }

        JobApplication app = opt.get();
        app.setStatus(status);

        return applicationService.update(app);
    }
}

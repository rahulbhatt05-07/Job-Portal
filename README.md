# Job-Portal
Spring Boot Online Job Portal: Candidates &amp; Employers Management with REST APIs

# Project Overview

A full-featured Online Job Portal backend application built with Spring Boot and MySQL, designed to connect job seekers and employers.

# Key Features:

1. Candidate: Register, login, view jobs, apply for jobs.

2. Employer: Register, login, post jobs, manage applications.

3. Job Management: Create, read, update, delete jobs.

4. Application Management: Apply, view, and update job application status.

5. Authentication: Simple email/password authentication (no Spring Security).

6. REST APIs: All functionality exposed via REST endpoints for frontend integration.

# Tech Stack

1. Java 21 & Spring Boot

2. MySQL (Database)

3. JPA / Hibernate (ORM)

4. Lombok (for boilerplate code reduction)

5. Maven (Project management)

# Project Structure

JopPortal/
├─ src/main/java/com/example/jobportal/
│   ├─ controller/        # REST controllers
│   ├─ entity/            # JPA entities
│   ├─ repository/        # JPA repositories
│   ├─ service/           # Business logic
│   └─ JopPortalApplication.java
├─ src/main/resources/
│   └─ application.properties
├─ pom.xml
└─ README.md

# API Endpoints

## User (Candidate/Employer)

1. POST /api/users/register → Register user

2. POST /api/users/login → Login user

##  Jobs (Employer)
1. GET /api/jobs → List all jobs

2. POST /api/jobs → Post a job

3. GET /api/jobs/{id} → Get job by ID

4. DELETE /api/jobs/{id} → Delete job

## Applications (Candidate)

1. POST /api/applications → Apply for a job

2. GET /api/applications/candidate/{candidateId} → Get candidate’s applications

3. GET /api/applications/job/{jobId} → Get all applications for a job

4. PUT /api/applications/{id}/status → Update application status

# How to Run

Clone the repo

git clone 'https://github.com/rahulbhatt05-07/Job-Portal.git'


# Open project in IntelliJ IDEA

Set up MySQL database and update application.properties

Run the project as Spring Boot Application

Test APIs with Postman

# Smart TimeTable Scheduler

## Overview

Smart TimeTable Scheduler is a constraint-based university timetable generation system designed to automate the scheduling process in higher education institutions.

The system generates conflict-free timetables while considering faculty workload, classroom availability, laboratory requirements, student batches, and scheduling constraints. The goal is to reduce manual effort, improve resource utilization, and create balanced timetables for students and faculty.

---

## Problem Statement

Universities often create timetables manually, which leads to:

* Faculty scheduling conflicts
* Classroom allocation issues
* Uneven faculty workload distribution
* Poor class distribution across the week
* Time-consuming timetable preparation
* Difficulty handling laboratories and electives

This project aims to automate timetable generation using scheduling algorithms and constraint satisfaction techniques.

---

## Features Implemented

### Domain Modeling

* Faculty Management
* Course Management
* Batch Management
* Classroom Management
* Slot Management
* Timetable Entry Management

### Scheduling Engine

* Automatic Course Scheduling
* Weekly Class Distribution
* Faculty Workload Tracking
* Faculty-Course Mapping
* Laboratory Scheduling
* Conflict Detection

### Constraint Validation

* Faculty Clash Detection
* Batch Clash Detection
* Classroom Clash Detection
* Classroom Capacity Validation
* Lab Room Validation

---

## Project Architecture

```text
Course Assignment
        │
        ▼
Faculty Selector
        │
        ▼
Constraint Checker
        │
        ▼
Scheduling Engine
        │
        ▼
Timetable Generator
        │
        ▼
Final Timetable
```

## Current Folder Structure

```text
src
│
├── model
│   ├── Faculty.java
│   ├── Course.java
│   ├── Batch.java
│   ├── Classroom.java
│   ├── Slot.java
│   ├── TimeTableEntry.java
│   ├── CourseAssignment.java
│   └── SchedulingRequest.java
│
├── scheduler
│   ├── ConstraintChecker.java
│   ├── FacultySelector.java
│   ├── BacktrackingScheduler.java
│   ├── TimetableGenerator.java
│   └── PriorityScheduler.java
│
└── Main.java
```

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Data Structures
* Constraint Satisfaction Techniques
* Backtracking Algorithms
* Scheduling Optimization Concepts

---

## Scheduling Strategy

The scheduler follows a balanced allocation approach:

1. Distribute classes across multiple days.
2. Prevent faculty timetable clashes.
3. Prevent classroom allocation conflicts.
4. Allocate laboratories in continuous slots.
5. Balance faculty workload.
6. Validate classroom capacity.
7. Generate conflict-free schedules.

Example:

Instead of:

```text
Mon P1
Mon P2
Mon P3
Mon P4
```

The scheduler generates:

```text
Mon P1
Tue P1
Wed P1
Thu P1
```

to ensure balanced learning schedules.

---

## Future Enhancements

### Phase 1

* Multiple Faculty Allocation
* Faculty Availability Management
* Dynamic Faculty Selection

### Phase 2

* Advanced Backtracking Engine
* Priority-Based Scheduling
* Elective Scheduling
* Professional Elective Scheduling

### Phase 3

* CSV/Excel Data Import
* Bulk Data Processing
* Large University Dataset Support

### Phase 4

* Spring Boot REST APIs
* Database Integration (MySQL/PostgreSQL)
* Authentication and Authorization

### Phase 5

* React Frontend Dashboard
* Timetable Visualization
* Export to Excel/PDF

---

## Scalability Goal

The system is being designed to support:

* 1500+ Students
* 100+ Faculty Members
* Multiple Departments
* Multiple Semesters
* Multiple Sections
* Large Classroom Inventories
* Laboratory Scheduling

---

## Learning Outcomes

Through this project, the following software engineering concepts are being applied:

* Software Development Life Cycle (SDLC)
* Object-Oriented Design
* Scheduling Algorithms
* Constraint Satisfaction Problems (CSP)
* Resource Allocation Systems
* Backtracking Techniques
* Scalable Software Architecture

---

## Author

Developed as a Software Engineering and Scheduling Optimization Project to solve real-world university timetable generation challenges.

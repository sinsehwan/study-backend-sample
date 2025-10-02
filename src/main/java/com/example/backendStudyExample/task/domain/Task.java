package com.example.backendStudyExample.task.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long id;

    @Column(nullable = false)
    String title;
    @Column(columnDefinition = "TEXT", nullable = false)
    String description;
    @Column(nullable = false)
    LocalDateTime dueDate;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    TaskStatus status;

    public Task(
            String title,
            String description,
            LocalDateTime dueDate,
            TaskStatus status
    ) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
    }

    protected Task() {

    }
}

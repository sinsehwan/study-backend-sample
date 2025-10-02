package com.example.backendStudyExample.util;

import com.example.backendStudyExample.task.domain.Task;
import com.example.backendStudyExample.task.domain.TaskStatus;

import java.time.LocalDateTime;

public class TestEntityUtil {

    public static Task makeTask() {
        return new Task(
                "test title",
                "test description",
                LocalDateTime.now(),
                TaskStatus.TODO
        );
    }

    public static Task makeTaskWithId(Long id) {
        return new Task(
                id,
                "test title",
                "test description",
                LocalDateTime.now(),
                TaskStatus.TODO
        );
    }
}

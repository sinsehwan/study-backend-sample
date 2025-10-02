package com.example.backendStudyExample.util;

import com.example.backendStudyExample.task.domain.TaskStatus;
import com.example.backendStudyExample.task.dto.NewTaskRequestDto;

import java.time.LocalDateTime;

public class TestDtoUtil {

    public static NewTaskRequestDto makeNewTaskRequestDto() {
        return new NewTaskRequestDto(
                "test title",
                "test description",
                LocalDateTime.now(),
                TaskStatus.TODO
        );
    }
}

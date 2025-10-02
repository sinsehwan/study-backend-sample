package com.example.backendStudyExample.task.dto;

import com.example.backendStudyExample.task.domain.TaskStatus;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record NewTaskRequestDto(
        @NotBlank(message = "제목은 필수 값입니다.")
        String title,
        @NotBlank(message = "상세 설명은 필수 값입니다.")
        String description,
        @NotBlank(message = "마감 기한은 필수 값입니다.")
        LocalDateTime dueDate,
        @NotBlank(message = "상태는 필수 값입니다.")
        TaskStatus status
) {
}

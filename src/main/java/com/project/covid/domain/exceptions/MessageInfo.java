package com.project.covid.domain.exceptions;

import lombok.Builder;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Builder
public record MessageInfo(
        String message,
        HttpStatus status,
        LocalDateTime dateTime
) {
}

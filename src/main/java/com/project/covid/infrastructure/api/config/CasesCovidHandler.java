package com.project.covid.infrastructure.api.config;

import com.project.covid.domain.exceptions.BadRequestException;
import com.project.covid.domain.exceptions.ErrorJsonMapperException;
import com.project.covid.domain.exceptions.MessageInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class CasesCovidHandler {


    @ExceptionHandler(value = {
            ErrorJsonMapperException.class,
            BadRequestException.class
    })
    public ResponseEntity<MessageInfo> badRequestHandler(Exception ex) {
        MessageInfo messageInfo = MessageInfo.builder()
                .message(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST)
                .dateTime(LocalDateTime.now())
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(messageInfo);
    }


}

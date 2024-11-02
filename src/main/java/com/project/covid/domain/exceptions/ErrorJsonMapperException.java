package com.project.covid.domain.exceptions;

public class ErrorJsonMapperException extends RuntimeException {

    public ErrorJsonMapperException() {
        super("error when mapper String to Json");
    }
}

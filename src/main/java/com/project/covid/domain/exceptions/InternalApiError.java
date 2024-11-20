package com.project.covid.domain.exceptions;

public class InternalApiError extends RuntimeException{

    public InternalApiError(String message) {
        super(message);
    }
}

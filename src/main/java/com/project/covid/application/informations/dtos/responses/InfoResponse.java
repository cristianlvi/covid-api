package com.project.covid.application.informations.dtos.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public record InfoResponse(
        long total,
        @JsonProperty(value = "new")
        long news

) {
}

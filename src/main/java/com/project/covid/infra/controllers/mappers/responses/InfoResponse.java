package com.project.covid.infra.controllers.mappers.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public record InfoResponse(
        long total,
        @JsonProperty(value = "new")
        long news
) {}

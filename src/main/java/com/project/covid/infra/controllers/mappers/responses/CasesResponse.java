package com.project.covid.infra.controllers.mappers.responses;

import java.util.HashMap;

public record CasesResponse(
        String country,
        String region,
        HashMap<String, InfoResponse> cases
) {
}

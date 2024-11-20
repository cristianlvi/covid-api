package com.project.covid.application.informations.dtos.responses;

import java.util.HashMap;

public record CasesResponse(
        String country,
        String region,
        HashMap<String, InfoResponse> cases
) {
}

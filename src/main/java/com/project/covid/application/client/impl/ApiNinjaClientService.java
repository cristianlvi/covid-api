package com.project.covid.application.client.impl;

import com.project.covid.application.client.IApiNinjaClient;
import com.project.covid.application.informations.dtos.CountryRequest;
import com.project.covid.infrastructure.feign.ApiNinjaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ApiNinjaClientService implements IApiNinjaClient {

    @Value("${client.ninja-api.token.header.key}")
    private String token;

    private final ApiNinjaClient apiNinjaClient;

    @Autowired
    public ApiNinjaClientService(ApiNinjaClient apiNinjaClient) {
        this.apiNinjaClient = apiNinjaClient;
    }

    @Override
    public String getInformation(CountryRequest countryRequest) {
        return apiNinjaClient.getSearchCasesCountry(countryRequest.type(), countryRequest.country(), token);
    }

}

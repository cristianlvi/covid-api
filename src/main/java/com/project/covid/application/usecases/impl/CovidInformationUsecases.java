package com.project.covid.application.usecases.impl;

import com.project.covid.application.gateways.ApiNinjaClient;
import com.project.covid.application.usecases.ICovidInformationUsecase;
import com.project.covid.domain.CountryDomain;
import com.project.covid.infra.controllers.dtos.CasesResponsesMapper;
import com.project.covid.infra.controllers.dtos.requests.CountryRequest;
import com.project.covid.infra.controllers.dtos.responses.CasesResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CovidInformationUsecases implements ICovidInformationUsecase {

    private static final Logger logger = LoggerFactory.getLogger(CovidInformationUsecases.class);

    private final ApiNinjaClient apiNinjaClient;

    public CovidInformationUsecases(ApiNinjaClient apiNinjaClient) {
        this.apiNinjaClient = apiNinjaClient;
    }

    @Override
    public CasesResponse getInformationCovidByCountry(CountryRequest countryRequest) {
        CountryDomain countryDomain = apiNinjaClient.getAllInformation(countryRequest);

        logger.info("country with all information found");
        return CasesResponsesMapper.toCasesResponse(countryDomain);
    }
}

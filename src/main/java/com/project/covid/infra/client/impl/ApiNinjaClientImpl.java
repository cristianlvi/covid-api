package com.project.covid.infra.client.impl;

import com.project.covid.application.gateways.ApiNinjaClient;
import com.project.covid.domain.CountryDomain;
import com.project.covid.infra.client.ApiNinjaClientFeign;
import com.project.covid.infra.config.GsonConfig;
import com.project.covid.infra.controllers.mappers.requests.CountryRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApiNinjaClientImpl implements ApiNinjaClient {

    private static final Logger logger = LoggerFactory.getLogger(ApiNinjaClientImpl.class);

    private final ApiNinjaClientFeign apiNinjaClientFeign;
    private final String token;
    private final GsonConfig gsonConfig;

    public ApiNinjaClientImpl(ApiNinjaClientFeign apiNinjaClientFeign,
                              @Value("${client.ninja-api.token.header.key}") String tokenApi,
                              GsonConfig gson) {
        this.apiNinjaClientFeign = apiNinjaClientFeign;
        this.token = tokenApi;
        this.gsonConfig = gson;
    }

    @Override
    public CountryDomain getAllInformation(CountryRequest countryRequest) {
        logger.info("find country [{}] in an external API ", countryRequest.country());
        final String response = apiNinjaClientFeign.getSearchCasesCountry(countryRequest.type(), countryRequest.country(), token);

        CountryDomain[] countryDomain = gsonConfig.getGson().fromJson(response, CountryDomain[].class);

        return countryDomain[0];
    }

}

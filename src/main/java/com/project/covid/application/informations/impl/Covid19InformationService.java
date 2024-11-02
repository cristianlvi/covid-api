package com.project.covid.application.informations.impl;

import com.project.covid.application.client.IApiNinjaClient;
import com.project.covid.application.config.GsonConfig;
import com.project.covid.application.informations.ICovid19Information;
import com.project.covid.application.informations.dtos.CountryRequest;
import com.project.covid.application.informations.dtos.responses.CasesResponse;
import com.project.covid.domain.exceptions.ErrorJsonMapperException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class Covid19InformationService implements ICovid19Information {

    private final IApiNinjaClient apiNinjaClient;
    private final GsonConfig gson;

    @Autowired
    public Covid19InformationService(IApiNinjaClient apiNinjaClient,
                                     GsonConfig gson) {
        this.apiNinjaClient = apiNinjaClient;
        this.gson = gson;
    }

    @Override
    public CasesResponse searchCases(CountryRequest countryRequest) {
        log.info("search values about county: [{}]", countryRequest.country());

        String body = apiNinjaClient.getInformation(countryRequest);
        try {
            CasesResponse[] cases = gson.getGson().fromJson(body, CasesResponse[].class);

            return cases[0];
        } catch (Exception ex) {
            throw new ErrorJsonMapperException();
        }
    }

}

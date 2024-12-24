package com.project.covid.application.usecases;

import com.project.covid.infra.controllers.mappers.requests.CountryRequest;
import com.project.covid.infra.controllers.mappers.responses.CasesResponse;

public interface ICovidInformationUsecase {

    CasesResponse getInformationCovidByCountry(CountryRequest countryRequest);


}

package com.project.covid.application.usecases;

import com.project.covid.infra.controllers.dtos.requests.CountryRequest;
import com.project.covid.infra.controllers.dtos.responses.CasesResponse;

public interface ICovidInformationUsecase {

    CasesResponse getInformationCovidByCountry(CountryRequest countryRequest);


}

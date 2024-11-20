package com.project.covid.application.informations;

import com.project.covid.application.informations.dtos.CountryRequest;
import com.project.covid.application.informations.dtos.responses.CasesResponse;

public interface ICovid19Information {

    CasesResponse searchCases(CountryRequest countryRequest);

}

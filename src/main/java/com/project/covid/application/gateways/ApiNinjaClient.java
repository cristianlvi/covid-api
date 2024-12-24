package com.project.covid.application.gateways;

import com.project.covid.domain.CountryDomain;
import com.project.covid.infra.controllers.mappers.requests.CountryRequest;

public interface ApiNinjaClient {

    CountryDomain getAllInformation(CountryRequest countryRequest);

}

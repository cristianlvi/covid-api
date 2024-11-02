package com.project.covid.application.client;

import com.project.covid.application.informations.dtos.CountryRequest;

public interface IApiNinjaClient {

    String getInformation(CountryRequest countryRequest);


}

package com.project.covid.infra.controllers.controllers;

import com.project.covid.application.usecases.ICovidInformationUsecase;
import com.project.covid.infra.controllers.mappers.requests.CountryRequest;
import com.project.covid.infra.controllers.mappers.responses.CasesResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/covid19")
public class CasesCovidController {

    private final ICovidInformationUsecase covidInformationUsecases;

    public CasesCovidController(ICovidInformationUsecase covidInformationUsecases) {
        this.covidInformationUsecases = covidInformationUsecases;
    }

    @GetMapping("/search")
    public ResponseEntity<CasesResponse> getValuesInformationCases(@RequestBody CountryRequest countryRequest) {
        CasesResponse casesResponse = covidInformationUsecases.getInformationCovidByCountry(countryRequest);

        return ResponseEntity.status(HttpStatus.OK).body(casesResponse);
    }


}

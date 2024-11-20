package com.project.covid.infrastructure.api;

import com.project.covid.application.informations.ICovid19Information;
import com.project.covid.application.informations.dtos.CountryRequest;
import com.project.covid.application.informations.dtos.responses.CasesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/planisa/covid19")
public class CasesCovidController {

    private final ICovid19Information queryInformation;

    @Autowired
    public CasesCovidController(ICovid19Information queryInformation) {
        this.queryInformation = queryInformation;
    }

    @GetMapping("/search")
    public ResponseEntity<CasesResponse> getValuesInformationCases(@RequestBody CountryRequest countryRequest) {
        CasesResponse casesResponse = queryInformation.searchCases(countryRequest);

        return ResponseEntity.ok(casesResponse);
    }


}

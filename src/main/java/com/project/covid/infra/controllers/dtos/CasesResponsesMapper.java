package com.project.covid.infra.controllers.dtos;

import com.project.covid.domain.CountryDomain;
import com.project.covid.infra.controllers.dtos.responses.CasesResponse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CasesResponsesMapper {

    public static CountryDomain toCountryDomain(CasesResponse casesResponse) {
        return new CountryDomain(casesResponse.country(), casesResponse.region(), casesResponse.cases());
    }

    public static CasesResponse toCasesResponse(CountryDomain countryDomain) {
        return new CasesResponse(countryDomain.getCountry(), countryDomain.getRegion(), countryDomain.getCases());
    }


}

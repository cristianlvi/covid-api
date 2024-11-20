package com.project.covid.config;

import com.project.covid.application.gateways.ApiNinjaClient;
import com.project.covid.application.usecases.ICovidInformationUsecase;
import com.project.covid.application.usecases.impl.CovidInformationUsecases;
import com.project.covid.infra.client.ApiNinjaClientFeign;
import com.project.covid.infra.client.impl.ApiNinjaClientImpl;
import com.project.covid.infra.controllers.controllers.CasesCovidController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CovidInformationConfig {

    @Bean
    CovidInformationUsecases getCovidInformationUseCases(ApiNinjaClient apiNinjaClient) {
        return new CovidInformationUsecases(apiNinjaClient);
    }

    @Bean
    CasesCovidController casesCovidController(ICovidInformationUsecase iCovidInformationUsecase) {
        return new CasesCovidController(iCovidInformationUsecase);
    }

    @Bean
    ApiNinjaClientImpl apiNinjaClient(ApiNinjaClientFeign ninjaClientFeign,
                                      @Value("${client.ninja-api.token.header.key}") String tokenApi,
                                      GsonConfig gson) {
        return new ApiNinjaClientImpl(ninjaClientFeign, tokenApi, gson);
    }


}

package com.project.covid.infrastructure.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "api-ninja", url = "${client.ninja-api.url}")
public interface ApiNinjaClient {


    @GetMapping
    String getSearchCasesCountry(
            @RequestParam(defaultValue = "cases") String type,
            @RequestParam(name = "country") String name,
            @RequestHeader("x-api-key") String token
    );

}

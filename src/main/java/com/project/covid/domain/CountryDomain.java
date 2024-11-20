package com.project.covid.domain;

import com.project.covid.infra.controllers.dtos.responses.InfoResponse;

import java.util.HashMap;

public class CountryDomain {

    private String country;
    private String region;
    private HashMap<String, InfoResponse> cases;


    public CountryDomain() {
    }

    public CountryDomain(String country, String region, HashMap<String, InfoResponse> cases) {
        this.country = country;
        this.region = region;
        this.cases = cases;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public HashMap<String, InfoResponse> getCases() {
        return cases;
    }

    public void setCases(HashMap<String, InfoResponse> cases) {
        this.cases = cases;
    }
}

package com.project.covid.application.config;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GsonConfig {

    @Bean
    public Gson getGson() {
        return new Gson();
    }

}

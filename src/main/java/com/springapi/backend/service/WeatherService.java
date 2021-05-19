package com.springapi.backend.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springapi.backend.model.weather.response.WeatherResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WeatherService {

    @Autowired
    ObjectMapper objectMapper;

    private final static String CLASS_NAME = "WeatherService";

    public WeatherResponse getWeather() {
        final String METHOD_NAME = "getWeather";
        return null;
    }
}

package com.springapi.backend.controller;

import com.springapi.backend.model.weather.response.WeatherResponse;
import com.springapi.backend.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/weather")
public class WeatherController {

    // https://mysuperawesomeapp.com/weather/getWeather
    @Autowired
    private WeatherService weatherService;

    @RequestMapping(value="/getWeather", method=RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public WeatherResponse getWeather() {
        // now entering getWeather call
        // validate the request
        // hand off request to the service
        // return whatever service returns
        return null;
    }
}

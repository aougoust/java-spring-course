package com.example.controller;

import com.example.model.WeatherParams;
import com.example.service.OpenCurrencyClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Kacper Augustynowicz on 16.03.2017.
 */

@RestController
@RequestMapping("/newapi")
public class NewWeatherController {

    @Autowired
    OpenCurrencyClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(@RequestParam(name = "imie", required = false, defaultValue = "stranger") String name){
        return "hello" + name;
    }

    @RequestMapping("/weather")
    String getWeather(@Validated WeatherParams params){
        params.setCurrent(false);
        return params.toString();
    }

    @RequestMapping(value = "/weather", method = RequestMethod.POST)
    public String getWeatherPost(@RequestBody WeatherParams params){
        params.setCurrent(true);
        return params.toString();
    }


    @RequestMapping("/currency")
    String getExchange(){
        return client.getExchange("GBP","USD","latest");
    }
}

package com.example.controller;

import com.example.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Kacper Augustynowicz on 14.03.2017.
 */
@RestController
@RequestMapping("/api")
public class WeatherController {

    @Autowired
    private Collection<WeatherService> weatherServices;

    @Autowired
    @Qualifier("otherWeatherType")
    private String myBean;

    @RequestMapping("/weather")
    public List<String> allWeathers(){
        List<String> result = new ArrayList<String>();
        weatherServices.forEach(((x)->result.add(x.getWeather())));
        result.add(myBean);
        return result;
    }

    @RequestMapping("/weather/status")
    public ResponseEntity<List<String>> allWeathersStatus(){
        List<String> result = new ArrayList<String>();
        weatherServices.forEach(((x)->result.add(x.getWeather())));
        result.add(myBean);
        return new ResponseEntity<List<String>>(result, HttpStatus.CREATED);
    }

    @RequestMapping("/weather/status/dec")
    public List<String> allWeathersStatusDecorator(
            HttpServletRequest request,
            HttpServletResponse response
    ){
        List<String> result = new ArrayList<String>();
        weatherServices.forEach(((x)->result.add(x.getWeather())));
        response.setStatus(401);

        return result;
    }
}

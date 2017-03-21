package com.example.service.impl;

import com.example.service.WeatherService;
import com.example.service.impl.conditions.WindowsCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Kacper Augustynowicz on 14.03.2017.
 */
@Service("ugly")
public class UglyWeatherServiceImpl implements WeatherService {
    @Override
    public String getWeather() {
        return "It's rainy";
    }
}

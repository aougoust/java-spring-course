package com.example.model;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 * Created by Kacper Augustynowicz on 16.03.2017.
 */
@Data
public class WeatherParams {

    @Valid
    @Size(min=2, max=5)
    private String city;
    private String country;
    private boolean current;
}

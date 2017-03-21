package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kacper Augustynowicz on 16.03.2017.
 */
@Service
public class OpenCurrencyClient {

    String url = "http://api.fixer.io/";

    @Autowired
    RestTemplate rest;

    public String getExchange(String from, String to,String date){
        String tempUrl = url + date + "?symbols=" + to + "&base=" + from;
        Map<String, Object> response = rest.getForObject(tempUrl, HashMap.class);
        return response.toString();
    }
}

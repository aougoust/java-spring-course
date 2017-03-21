package com.example.controller;

import com.example.service.OpenCurrencyClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kacper Augustynowicz on 21.03.2017.
 */
@RestController
@RequestMapping("/currapi")
public class NewCurrencyExchangeController {
    @Autowired
    OpenCurrencyClient client;

    @RequestMapping("/currency")
    String getExchange(@RequestParam(name = "date", required = false, defaultValue = "latest") String date,
                       @RequestParam(name = "from") String from,
                       @RequestParam(name = "to") String to){

        return client.getExchange(from, to, date);
    }
}

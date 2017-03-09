package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Currency;

/**
 * Created by Kacper Augustynowicz on 08.03.2017.
 */
@RestController
@RequestMapping("/currency")
public class CurrencyExchangeController {
    @RequestMapping("/multiply-{value}-{multiplier}")
    public String multiplyCurrency(@PathVariable Long value,
                                   @PathVariable Double multiplier,
                                   @RequestParam("from") String from,
                                   @RequestParam("to") String to) throws RuntimeException{
        try{
            Currency.getInstance(from);
            Currency.getInstance(to);
        }catch(IllegalArgumentException ex){
            throw new RuntimeException("Something went wrong");
        }
        return value + from + " = " + value*multiplier + to;
    }
}

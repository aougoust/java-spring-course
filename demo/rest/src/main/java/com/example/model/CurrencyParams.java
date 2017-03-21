package com.example.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

/**
 * Created by Kacper Augustynowicz on 21.03.2017.
 */
@Data
public class CurrencyParams {
    @SerializedName(value = "base")
    private String base;
    @SerializedName(value = "date")
    private String date;
    @SerializedName(value = "rates")
    private Map<String, BigDecimal> rates;
}

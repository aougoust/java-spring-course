package com.example.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * Created by Kacper Augustynowicz on 09.03.2017.
 */
@Deprecated
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class CurrencyDTO {

    private BigDecimal value;
    private Currency currency;

}

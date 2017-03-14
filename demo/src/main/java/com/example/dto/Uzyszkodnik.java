package com.example.dto;

import lombok.*;

/**
 * Created by Kacper Augustynowicz on 09.03.2017.
 */

@Builder
@ToString
public class Uzyszkodnik {

    @Getter(AccessLevel.PROTECTED)
    private @Setter String imie;
    private String nazwisko;
}

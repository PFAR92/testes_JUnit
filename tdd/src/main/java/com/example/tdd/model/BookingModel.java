package com.example.tdd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class BookingModel {

    private String id;
    private String reserveName;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int numberGuests;
}

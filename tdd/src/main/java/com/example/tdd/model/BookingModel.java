package com.example.tdd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@Entity
@NoArgsConstructor
public class BookingModel {

    @Id
    private String id;
    private String reserveName;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int numberGuests;
}

package com.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = AUTO)
    private  Long id;
}

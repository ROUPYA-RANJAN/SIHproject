package com.backend.model;

import com.backend.House.FarmHouse;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private  String fullName;
    private  String email;
    private  String password;
    private  User_Role role;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private List<Order> orders = new ArrayList<>();
    @ElementCollection
    private List<FarmHouse>favorites = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)

    private List<Address> addresses = new ArrayList<>();



}

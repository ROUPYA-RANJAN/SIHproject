package com.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @ManyToOne
    private User customer;
    @JsonIgnore
    @ManyToOne
    private Farm farm;
    private  Long totalAmount;
    private  String orderStatus;
    private Date createdAt;
    @ManyToOne
    private Address delhiveryAddress;
    @OneToMany
    private List<Orderitems> items;

    private int totalitems;
    private  int totalprice;
}

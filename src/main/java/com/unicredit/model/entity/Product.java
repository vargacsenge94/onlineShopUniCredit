package com.unicredit.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private boolean isValid;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PricePerDay> pricePerDays;
}

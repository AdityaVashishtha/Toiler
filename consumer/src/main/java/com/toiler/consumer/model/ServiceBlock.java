package com.toiler.consumer.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ServiceBlock {

    @Id
    @GeneratedValue
    private int id;

    @Embedded
    @OneToMany(mappedBy = "id")
    @OrderColumn
    private Service[] service;

    @Column
    private double price;

    @Column
    private int quantity;

    @Embedded
    @OneToOne
    private Supplier supplier;
}

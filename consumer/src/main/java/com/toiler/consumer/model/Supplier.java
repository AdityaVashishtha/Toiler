package com.toiler.consumer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Supplier {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

    @Column(unique = true)
    private String mobile;

}

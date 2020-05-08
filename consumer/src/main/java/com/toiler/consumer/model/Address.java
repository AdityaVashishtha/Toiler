package com.toiler.consumer.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String houseNumber;

    @Column
    private String street;

    @Column
    private String locality;

    @Column
    private String landMark;

    @Column
    private String zipCode;

    @Column
    private String latitude;

    @Column
    private String longitude;

}

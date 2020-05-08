package com.toiler.consumer.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Service {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String title;

    @Column(length = 2500)
    private String description;


}

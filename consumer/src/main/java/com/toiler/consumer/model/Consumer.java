package com.toiler.consumer.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Consumer {

    @Id
    @GeneratedValue
    private int systemId;

    @Column(unique = true)
    private String mobile;

    @Embedded
    @OneToMany(mappedBy = "id")
    @OrderColumn
    private Address[] addresses;

    @Embedded
    @OneToOne
    private ShoppingHistory shoppingHistory;


}

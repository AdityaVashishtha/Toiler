package com.toiler.consumer.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ShoppingBlock {

    @Id
    @GeneratedValue
    private int id;

    @OneToMany(mappedBy = "id")
    @Embedded
    @OrderColumn
    private ServiceBlock[] serviceBlocks;


}

package com.toiler.consumer.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ShoppingHistory {

    @Id
    @GeneratedValue
    private int id;

    @Embedded
    @OneToMany(mappedBy = "id")
    @OrderColumn
    private ShoppingBlock[] shoppingBlocks;

}

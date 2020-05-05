package com.toiler.consumer.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Consumer {

    @Id
    private String consumerId;

    private String consumerMobile;

}

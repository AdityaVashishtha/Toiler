package com.toiler.consumer.repository;

import com.toiler.consumer.model.Consumer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
@RestResource
public interface ConsumerRepository extends CrudRepository<Consumer,String> {


}

package com.cuatroa.retotres.repository.crud;

import com.cuatroa.retotres.model.Vegetarian;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Oscar Florez Forero
 */
public interface VegetarianCrudRepository extends MongoRepository<Vegetarian, String> {
    
}

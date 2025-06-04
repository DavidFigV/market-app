package com.tecdesoftware.market.persistance.crud;
import com.tecdesoftware.market.persistance.entity.Producto;
import org.springframework.data.repository.CrudRepository;

// Métodos abstractos que en otras clases se implementarán mejor
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

}

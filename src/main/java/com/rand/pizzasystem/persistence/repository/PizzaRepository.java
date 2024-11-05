package com.rand.pizzasystem.persistence.repository;

import com.rand.pizzasystem.persistence.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {
    List<PizzaEntity> findAllByAvailable(boolean status);
}

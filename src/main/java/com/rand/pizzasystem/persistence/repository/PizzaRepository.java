package com.rand.pizzasystem.persistence.repository;

import com.rand.pizzasystem.persistence.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {
}

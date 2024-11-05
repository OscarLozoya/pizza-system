package com.rand.pizzasystem.persistence.repository;

import com.rand.pizzasystem.persistence.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<OrderEntity,Integer> {
}

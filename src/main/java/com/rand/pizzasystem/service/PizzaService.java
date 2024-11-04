package com.rand.pizzasystem.service;

import com.rand.pizzasystem.persistence.entity.PizzaEntity;
import com.rand.pizzasystem.persistence.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@Service
public class PizzaService {
    private final PizzaRepository pizzaRepository;

    @Autowired
    public PizzaService(PizzaRepository pizzaRepository){
        this.pizzaRepository = pizzaRepository;
    }

    public List<PizzaEntity> getAll(){
       return pizzaRepository.findAll();
    }

    public PizzaEntity gatPizza(int pizzaId){
        return pizzaRepository.findById(pizzaId).orElse(null);
    }

    public PizzaEntity savePizza(PizzaEntity pizza){
        return pizzaRepository.save(pizza);
    }

    public void deletePizza(int pizzaId){
        pizzaRepository.deleteById(pizzaId);
    }

    public boolean exist(int pizzaId){
        return pizzaRepository.existsById(pizzaId);
    }

}

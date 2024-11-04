package com.rand.pizzasystem.web.controller;

import com.rand.pizzasystem.persistence.entity.PizzaEntity;
import com.rand.pizzasystem.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pizzas")
public class PizzaController {

    private final PizzaService pizzaService;

    @Autowired
    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("/")
    public ResponseEntity<List<PizzaEntity>> getAll(){
        return ResponseEntity.ok(this.pizzaService.getAll());
    }
    @GetMapping("/{pizzaId}")
    public ResponseEntity<PizzaEntity> getPizza(@PathVariable("pizzaId") int pizzaId){
        return ResponseEntity.ok(this.pizzaService.gatPizza(pizzaId));
    }

    @PostMapping("/add")
    public ResponseEntity<PizzaEntity> savePizza(@RequestBody PizzaEntity pizza){
        return ResponseEntity.ok(this.pizzaService.savePizza(pizza));
    }

    @PutMapping("/update")
    public ResponseEntity<PizzaEntity> updatePizza(@RequestBody PizzaEntity pizza){
        return ResponseEntity.ok(this.pizzaService.savePizza(pizza));
    }

    @DeleteMapping("/{pizzaId}")
    public ResponseEntity<Void> deletePizza(@PathVariable("pizzaId") int pizza){
        if(pizzaService.exist(pizza)){
            pizzaService.deletePizza(pizza);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
}

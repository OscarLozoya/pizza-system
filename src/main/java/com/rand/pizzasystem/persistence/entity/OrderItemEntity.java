package com.rand.pizzasystem.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_item")
@IdClass(OrderItemId.class)
@Getter
@Setter
@NoArgsConstructor
public class OrderItemEntity {
    @Id
    private Integer idItem;
    @Id
    private Integer idOrder;
    @Column(nullable = false)
    private Integer idPizza;
    @Column(nullable = false, columnDefinition = "Decimal(2,1)")
    private Double quantity;
    @Column(nullable = false, columnDefinition = "Decimal (5,2)")
    private Double price;

    @ManyToOne
    @JoinColumn(name ="idOrder", referencedColumnName = "idOrder", insertable = false, updatable = false)
    @JsonIgnore
    private OrderEntity order;
    //Exisitira el error que aqui debe de ir id_pizza ? o con los nombres de las clases estara bien ?
    @OneToOne
    @JoinColumn(name = "idPizza", referencedColumnName = "idPizza", insertable = false, updatable = false)
    private PizzaEntity pizza;
}

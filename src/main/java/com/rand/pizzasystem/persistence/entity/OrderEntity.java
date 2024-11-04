package com.rand.pizzasystem.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="pizza_order")
@Getter
@Setter
@NoArgsConstructor
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrder;
    @Column(nullable = false,length = 15)
    private String idCustomer;
    @Column(nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime date;
    @Column(nullable = false, columnDefinition = "Decimal(6,2)")
    private Float total;
    @Column(nullable = false, columnDefinition = "CHAR(1)")
    private String method;
    @Column(length = 200)
    private String additionalNotes;

    @OneToOne
    @JoinColumn(name = "idCustomer", referencedColumnName ="idCustomer", insertable = false, updatable = false )
    private CustomerEntity customer;

    @OneToMany(mappedBy = "order")
    private List<OrderItemEntity> items;
}

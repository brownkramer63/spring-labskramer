package com.cydeo.entitys;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "orders")
@Entity
public class Orders extends BaseEntity {
    private int paid_price;
    private int total_price;
    @ManyToOne
    private Customer customer;
    @OneToOne
    private Cart cart;
   @OneToOne
    private Payment payment;




}

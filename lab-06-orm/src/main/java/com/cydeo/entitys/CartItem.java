package com.cydeo.entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "cart_item")
@Entity
public class CartItem extends BaseEntity{
    private int quantity;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Cart cart;



}

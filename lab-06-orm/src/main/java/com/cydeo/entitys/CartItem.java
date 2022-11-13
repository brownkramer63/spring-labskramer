package com.cydeo.entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
//@Table(name = "cart_item")
@Entity
public class CartItem extends BaseEntity{
    private Integer quantity;
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
    @ManyToOne
    private Cart cart;



}

package com.cydeo.lab07ormqueries.entitys;

import com.cydeo.enums.CartState;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
//@Table(name = "cart")
@Entity
public class Cart extends BaseEntity{
    @Enumerated(EnumType.STRING)
    private CartState cartState;
//    @OneToMany
//    private List<CartItem> cartItems;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Discount discount;
//    @OneToOne
//    private Orders orders;
}

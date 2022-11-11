package com.cydeo.entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "product")
@Entity
public class Product extends BaseEntity {
    private String name;
    private double price; //potential bug
    private int quantity;
    private int remaining_quantity;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="product_category_rel",
            joinColumns = @JoinColumn(name="p_id"),
            inverseJoinColumns = @JoinColumn(name="c_id"))
    private List<Category> category;

    @OneToMany
    private List<CartItem> cartItems;

}

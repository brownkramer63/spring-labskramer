package com.cydeo.entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
    @OneToMany
    private List<Category> categories;
    @OneToMany
    private List<Cart> carts;

}

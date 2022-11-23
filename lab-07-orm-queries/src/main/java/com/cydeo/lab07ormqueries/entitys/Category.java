package com.cydeo.lab07ormqueries.entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
//@Table(name = "category")
@Entity
public class Category extends BaseEntity{
    private String name;
//    @OneToMany
//    private List<Product> products;
    //using join table soley in product class

}

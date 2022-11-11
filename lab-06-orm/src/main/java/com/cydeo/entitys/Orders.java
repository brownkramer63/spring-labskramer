package com.cydeo.entitys;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "orders")
@Entity
public class Orders extends BaseEntity {
    private int paid_price;
    private int total_price;

}

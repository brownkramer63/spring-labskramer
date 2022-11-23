package com.cydeo.lab07ormqueries.entitys;


import com.cydeo.enums.DiscountType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
//@Table(name = "discount")
@Entity

public class Discount extends BaseEntity{
    private BigDecimal discount;
    @Enumerated(EnumType.STRING)
    private DiscountType discountType;
    private String name;
//    @OneToMany
//    private List<Cart> carts;

}

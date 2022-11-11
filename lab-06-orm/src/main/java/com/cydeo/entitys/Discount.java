package com.cydeo.entitys;


import com.cydeo.enums.DiscountType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "discount")
@Entity

public class Discount extends BaseEntity{
    private int discount;
    @Enumerated(EnumType.STRING)
    private DiscountType discountType;
    private String name;
    @OneToMany
    private List<Cart> carts;

}

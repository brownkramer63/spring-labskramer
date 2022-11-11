package com.cydeo.entitys;

import com.cydeo.enums.CartState;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "cart")
@Entity
public class Cart extends BaseEntity{
    @Enumerated(EnumType.STRING)
    private CartState cartState;
    @OneToMany
    private List<Product> products;
    @ManyToOne
    private Customer customer;
}

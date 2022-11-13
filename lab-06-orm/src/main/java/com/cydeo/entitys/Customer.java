package com.cydeo.entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
//@Table(name = "customer")
@Entity
public class Customer extends BaseEntity{

    private String email;
    private String firstName;
    private String lastName;
    private String userName;
//    @OneToOne  the instructor builds the relations in the other tables hmmmm
//    private Balance balance;
//    @OneToMany
//    private List<Address> addresses;
//    @OneToMany
//    private List<Orders> orders;
//    @OneToMany
//    private List<Cart> carts;

}

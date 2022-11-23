package com.cydeo.lab07ormqueries.entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

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

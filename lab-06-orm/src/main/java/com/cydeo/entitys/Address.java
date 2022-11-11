package com.cydeo.entitys;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "address")
@Entity

public class Address extends BaseEntity{
    private String name;
    private String street;
    private String zip_code;
    @ManyToOne
    private Customer customer;


}

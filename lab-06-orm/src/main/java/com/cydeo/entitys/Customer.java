package com.cydeo.entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "customer")
@Entity
public class Customer extends BaseEntity{

    private String email;
    private String first_name;
    private String last_name;
    private String user_name;

}

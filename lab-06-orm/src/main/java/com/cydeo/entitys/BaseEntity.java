package com.cydeo.entitys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
//to avoid area with @data we are using getter and setter
//@NoArgsConstructor we dont need constructors as we arent instantiating anything
//@AllArgsConstructor
@MappedSuperclass //we want to use this class for parent child relation still
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

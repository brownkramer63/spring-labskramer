package com.cydeo.lab07ormqueries.entitys;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
//@Table(name = "balance")
@Entity

public class Balance extends BaseEntity {
    private BigDecimal amount;
    @OneToOne
    private Customer customer;

}

package com.cydeo.entitys;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
//@Table(name = "balance")
@Entity

public class Balance extends BaseEntity{
    private BigDecimal amount;
    @OneToOne
    private Customer customer;

}

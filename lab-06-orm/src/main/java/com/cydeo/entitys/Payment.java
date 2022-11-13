package com.cydeo.entitys;


import com.cydeo.enums.PaymentMethod;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "payment")
@Entity
public class Payment extends BaseEntity {
    private BigDecimal paid_price;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
//    @OneToOne
//    private Orders orders;



}

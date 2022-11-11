package com.cydeo.entitys;


import com.cydeo.enums.PaymentMethod;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "payment")
@Entity
public class Payment extends BaseEntity {
    private int paid_price;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    @OneToOne
    private Orders orders;



}

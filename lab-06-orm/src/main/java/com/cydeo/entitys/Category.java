package com.cydeo.entitys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "category")
@Entity
public class Category extends BaseEntity{
    private String name;
//    @OneToMany
//    private List<Product> products;
    //using join table soley in product class

}

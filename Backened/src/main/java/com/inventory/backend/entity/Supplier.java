package com.inventory.backend.entity;

import org.hibernate.annotations.IdGeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="suppliers")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)



    private long id;
    private String name;
    private String conctactPerson;

    private String phone;
    private String email;
    private String notes;


}

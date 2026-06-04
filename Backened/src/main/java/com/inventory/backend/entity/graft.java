package com.inventory.backend.entity;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;


public class graft {


@Entity
@Table(name = "grafts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Graft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String graftName;
    private String type;
    private String sizeWeight;
    private Integer quantityInStock;
    private String lotBatchNumber;

    private LocalDate purchaseDate;
    private LocalDate expiryDate;
}



























}

package com.sheryians.major.model;

import javax.persistence.*;
@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(stratery = GenerationType.AUTO)

    private Long id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;

}

package com.sheryians.major.model;
import lombok.Data;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(stratery = GenerationType.AUTO)
    @Column(name = "category_id")
    private int id;

    private String name;
}

package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor // Дефолтный конструкт
@AllArgsConstructor // Конструктор с совсеми параметрами
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String author;

    @Temporal(TemporalType.DATE)
    // @Type(type = "date") Либо так
    private Date dateRealise;

    private int pagesInABook;
}

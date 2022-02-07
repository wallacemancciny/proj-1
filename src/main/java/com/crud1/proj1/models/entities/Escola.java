package com.crud1.proj1.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "escola")
@Data
public class Escola {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;


}

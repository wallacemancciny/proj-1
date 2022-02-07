package com.crud1.proj1.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name= "disciplina")
@Data
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Boolean ativo;

/*    @ManyToOne
    @JoinColumn(name = "id_escola", referencedColumnName = "id")
    private Escola escola;*/

}

package org.example.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Genero() {}

    public Genero(String nome, Long id) {this.nome = nome;this.id = id;}

    public void setId(Long id) {this.id = id;}
    public void setNome(String nome) {this.nome = nome;}
    public Long getId() {return id;}
    public String getNome() {return nome;}
}

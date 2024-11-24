package org.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany
    private List<Genero> generos;

    @OneToMany(mappedBy = "artista")
    private List<Disco> discos;

    public Artista(Long id, String nome, List<Genero> generos, List<Disco> discos) {
        this.id = id;
        this.nome = nome;
        this.generos = generos;
        this.discos = discos;
    }

    public Artista() {}

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public List<Genero> getGeneros() {return generos;}
    public void setGeneros(List<Genero> generos) {this.generos = generos;}
    public List<Disco> getDiscos() {return discos;}
    public void setDiscos(List<Disco> discos) {this.discos = discos;}
}

package org.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Disco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private int anoLancamento;
    private String capa;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "disco")
    private List<Faixa> faixas;

    @ManyToOne
    private Artista artista;

    @ManyToMany
    private List<Genero> generos;

    public Disco(Long id, String titulo, int anoLancamento, String capa, List<Faixa> faixas, Artista artista, List<Genero> generos) {
        this.id = id;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.capa = capa;
        this.faixas = faixas;
        this.artista = artista;
        this.generos = generos;
    }

    public Disco() {}

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public int getAnoLancamento() {return anoLancamento;}
    public void setAnoLancamento(int anoLancamento) {this.anoLancamento = anoLancamento;}
    public String getCapa() {return capa;}
    public void setCapa(String capa) {this.capa = capa;}
    public List<Faixa> getFaixas() {return faixas;}
    public void setFaixas(List<Faixa> faixas) {this.faixas = faixas;}
    public Artista getArtista() {return artista;}
    public void setArtista(Artista artista) {this.artista = artista;}
    public List<Genero> getGeneros() {return generos;}
    public void setGeneros(List<Genero> generos) {this.generos = generos;}
}

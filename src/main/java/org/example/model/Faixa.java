package org.example.model;

import jakarta.persistence.*;

@Entity
public class Faixa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @ManyToOne
    private Disco disco;

    public Faixa(Long id, String titulo, Disco disco) {
        this.id = id;
        this.titulo = titulo;
        this.disco = disco;
    }

    public Faixa() {}

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public Disco getDisco() {return disco;}
    public void setDisco(Disco disco) {this.disco = disco;}
}

package org.example.controller;

import org.example.model.Genero;
import org.example.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/generos")
public class GeneroController {
    @Autowired
    private GeneroService generoService;

    @GetMapping
    public List<Genero> listar() {
        return generoService.listar();
    }

    @PostMapping
    public Genero criar(@RequestBody Genero genero) { return generoService.salvar(genero); }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        generoService.deletar(id);
    }
}

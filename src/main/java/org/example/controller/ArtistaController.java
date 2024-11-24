package org.example.controller;

import org.example.model.Artista;
import org.example.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {
    @Autowired
    private ArtistaService artistaService;

    @GetMapping
    public List<Artista> listar() {
        return artistaService.listar();
    }

    @PostMapping
    public Artista criar(@RequestBody Artista artista) {
        return artistaService.salvar(artista);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        artistaService.deletar(id);
    }
}

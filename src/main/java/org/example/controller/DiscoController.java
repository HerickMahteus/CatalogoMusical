package org.example.controller;

import org.example.model.Disco;
import org.example.service.DiscoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/discos")
public class DiscoController {
    @Autowired
    private DiscoService discoService;

    @GetMapping
    public List<Disco> listar() {
        return discoService.listar();
    }

    @PostMapping
    public Disco criar(@RequestBody Disco disco) {
        return discoService.salvar(disco);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        discoService.deletar(id);
    }
}

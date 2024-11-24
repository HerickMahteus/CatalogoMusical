package org.example.controller;

import org.example.model.Faixa;
import org.example.service.FaixaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/faixas")
public class FaixaController {
    @Autowired
    private FaixaService faixaService;

    @GetMapping
    public List<Faixa> listar() { return faixaService.listar(); }

    @PostMapping
    public Faixa criar(@RequestBody Faixa faixa) {
        return faixaService.salvar(faixa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        faixaService.deletar(id);
    }
}

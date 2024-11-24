package org.example.service;

import org.example.model.Genero;
import org.example.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {
    @Autowired
    private GeneroRepository generoRepository;

    public List<Genero> listar() {
        return generoRepository.findAll();
    }

    public Genero salvar(Genero genero) {
        return generoRepository.save(genero);
    }

    public void deletar(Long id) { generoRepository.deleteById(id); }
}

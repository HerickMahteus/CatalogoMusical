package org.example.service;

import org.example.model.Artista;
import org.example.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistaService {
    @Autowired
    private ArtistaRepository artistaRepository;

    public List<Artista> listar() {
        return artistaRepository.findAll();
    }

    public Artista salvar(Artista artista) {
        return artistaRepository.save(artista);
    }

    public void deletar(Long id) {
        artistaRepository.deleteById(id);
    }
}

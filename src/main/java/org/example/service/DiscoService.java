package org.example.service;

import org.example.model.Disco;
import org.example.repository.DiscoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DiscoService {
    @Autowired
    private DiscoRepository discoRepository;

    public List<Disco> listar() {
        return discoRepository.findAll();
    }

    public Disco salvar(Disco disco) {
        return discoRepository.save(disco);
    }

    public void deletar(Long id) {
        discoRepository.deleteById(id);
    }
}

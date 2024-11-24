package org.example.service;

import org.example.model.Faixa;
import org.example.repository.FaixaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaixaService {
    @Autowired
    private FaixaRepository faixaRepository;

    public List<Faixa> listar() { return faixaRepository.findAll(); }

    public Faixa salvar(Faixa faixa) {
        return faixaRepository.save(faixa);
    }

    public void deletar(Long id) {
        faixaRepository.deleteById(id);
    }
}

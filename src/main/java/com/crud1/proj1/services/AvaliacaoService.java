package com.crud1.proj1.services;

import com.crud1.proj1.models.entities.Avaliacao;
import com.crud1.proj1.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public void salvar(Avaliacao avaliacao) throws Exception {
        avaliacaoRepository.save(avaliacao);
    }

    public void atualizar(Avaliacao avaliacao) throws Exception {
        avaliacaoRepository.save(avaliacao);
    }

    public void deletar(Avaliacao avaliacao) throws Exception {
        avaliacaoRepository.delete(avaliacao);
    }

    public List<Avaliacao> listarTodos() throws Exception {
        return avaliacaoRepository.findAll();
    }

    public Avaliacao buscarPorId(Integer id) throws Exception {
        return avaliacaoRepository.findById(id).get();
    }
}

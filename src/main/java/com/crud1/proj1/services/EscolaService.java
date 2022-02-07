package com.crud1.proj1.services;

import com.crud1.proj1.models.entities.Escola;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud1.proj1.repository.EscolaRepository;

import java.util.List;

@Service
public class EscolaService {

        @Autowired
        private EscolaRepository escolaRepository;

        public void salvar (Escola escola) throws Exception {
        escolaRepository.save(escola);
        }

        public void atualizar (Escola escola) throws Exception {
        escolaRepository.save(escola);
        }

        public void deletar (Escola escola) throws Exception {
            escolaRepository.delete(escola);
        }

        public List<Escola> listarTodos() throws Exception {
            return escolaRepository.findAll();
        }

        public Escola buscarPorId(Integer id) throws Exception {
            return escolaRepository.findById(id).get();
        }
        //crud - create, read, update and delete
}

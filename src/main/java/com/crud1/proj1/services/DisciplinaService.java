package com.crud1.proj1.services;

import com.crud1.proj1.models.entities.Disciplina;
import com.crud1.proj1.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    private  DisciplinaRepository disciplinaRepository;

    public void salvar(Disciplina disciplina) throws Exception {
        disciplinaRepository.save(disciplina);
    }

    public void atualizar(Disciplina disciplina) throws Exception {
        disciplinaRepository.save(disciplina);
    }

    public void deletar(Disciplina disciplina) throws Exception {
        disciplinaRepository.delete(disciplina);
    }

    public List<Disciplina> listarTodos() throws Exception{
        return disciplinaRepository.findAll();
    }

    public Disciplina buscarPorId(Integer id) throws Exception {
        return disciplinaRepository.findById(id).get();
    }
}
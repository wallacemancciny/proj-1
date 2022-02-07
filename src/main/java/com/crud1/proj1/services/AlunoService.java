package com.crud1.proj1.services;

import com.crud1.proj1.models.entities.Aluno;
import com.crud1.proj1.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public void salvar(Aluno aluno) throws Exception {
        alunoRepository.save(aluno);
    }

    public void atualizar(Aluno aluno) throws Exception {
        alunoRepository.save(aluno);
    }

    public void deletar(Aluno aluno) throws Exception {
        alunoRepository.delete(aluno);
    }

    public List<Aluno> listarTodos() throws Exception {
        return alunoRepository.findAll();
    }

    public Aluno buscarPorId(Integer id) throws Exception {
        return alunoRepository.findById(id).get();
    }

}

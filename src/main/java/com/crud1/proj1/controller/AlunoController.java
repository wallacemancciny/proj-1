package com.crud1.proj1.controller;

import com.crud1.proj1.models.entities.Aluno;
import com.crud1.proj1.models.enums.MensagemEnum;
import com.crud1.proj1.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping("/salvar")
    public String salvar (@RequestBody Aluno aluno) {
        try {
            alunoService.salvar(aluno);
            return MensagemEnum.SUCESSO.getValue();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @PostMapping("/atualizar")
    public String atualizar (@RequestBody Aluno aluno) {
        try {
            alunoService.atualizar(aluno);
            return MensagemEnum.SUCESSO.getValue();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @PostMapping("/deletar")
    public String deletar (@RequestBody Aluno aluno) {
        try {
            alunoService.deletar(aluno);
            return MensagemEnum.SUCESSO.getValue();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @GetMapping("/listarTodos")
    public List<Aluno> listarTodos() throws Exception {
        return alunoService.listarTodos();
    }
}

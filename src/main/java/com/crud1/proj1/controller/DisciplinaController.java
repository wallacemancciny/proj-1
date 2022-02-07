package com.crud1.proj1.controller;

import com.crud1.proj1.models.entities.Avaliacao;
import com.crud1.proj1.models.entities.Disciplina;
import com.crud1.proj1.models.enums.MensagemEnum;
import com.crud1.proj1.services.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    @Autowired
    private  DisciplinaService disciplinaService;

    @PostMapping ("/salvar")
    public String salvar(@RequestBody Disciplina disciplina) {
        try {
                disciplinaService.salvar(disciplina);
                return MensagemEnum.SUCESSO.getValue();
        } catch (Exception e) {
                return e.getMessage();
        }
    }

    @PostMapping ("/atualizar")
    public String atualizar(@RequestBody Disciplina disciplina) {
        try {
            disciplinaService.atualizar(disciplina);
            return MensagemEnum.SUCESSO.getValue();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @PostMapping("/deletar")
    public String deletar(@RequestBody Disciplina disciplina) {
        try {
            disciplinaService.deletar(disciplina);
            return MensagemEnum.SUCESSO.getValue();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @GetMapping("/listarTodos")
    public List<Disciplina> listarTodos() throws Exception{
        return disciplinaService.listarTodos();
    }

}

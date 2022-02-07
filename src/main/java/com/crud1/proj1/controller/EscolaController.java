package com.crud1.proj1.controller;

import com.crud1.proj1.models.entities.Disciplina;
import com.crud1.proj1.models.entities.Escola;
import com.crud1.proj1.models.enums.MensagemEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.crud1.proj1.services.EscolaService;

import java.util.List;

@RestController
@RequestMapping("/escola")
public class EscolaController {

    @Autowired
    private EscolaService escolaService;

    @PostMapping("/salvar")
    public String salvar(@RequestBody Escola escola) {
        try {
            escolaService.salvar(escola);
            return MensagemEnum.SUCESSO.getValue();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @PostMapping("/atualizar")
    public String atualizar(@RequestBody Escola escola) {
        try {
            escolaService.atualizar(escola);
            return MensagemEnum.SUCESSO.getValue();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @PostMapping("/deletar")
    public String deletar(@RequestBody Escola escola) {
        try {
            escolaService.deletar(escola);
            return MensagemEnum.SUCESSO.getValue();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @GetMapping("/listarTodos")
    public List<Escola> listarTodos() throws Exception {
        return escolaService.listarTodos();
    }

}

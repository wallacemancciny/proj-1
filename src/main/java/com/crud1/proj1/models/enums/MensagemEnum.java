package com.crud1.proj1.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum MensagemEnum {

    SUCESSO("Registro atualizado com sucesso!");

    @Getter
    private String value;
}
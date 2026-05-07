package com.aula.dockerSpring.dto;

public record ContaDTO(String nome, String cpf,
                       String telefone, String email ) {

    @Override
    public String toString() {
        return "Nome:" + nome + '\'' +
                "|| cpf:" + cpf + '\'' +
                "|| telefone='" + telefone + '\'' +
                "|| email='" + email;
    }
}

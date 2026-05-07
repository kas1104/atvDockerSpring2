package com.aula.dockerSpring.dto;

//Classe DTO de nomes
public record NomeDTO(String nome) {

    @Override
    public String toString() {
        return "Nome:" + nome ;
    }
}

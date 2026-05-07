package com.aula.dockerSpring.entities;

//Bibliotecas
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "nomes")
public class NomeEntity {

    //Atributos que criam as colunas conforme os nomes descritos na classe entidade
    @Id
    @GeneratedValue(strategy = GenerationType   .IDENTITY)
    private Long id;

    @Column
    private String nome;

    //Construtores
    public NomeEntity() {
    }

    public NomeEntity(String nome) {
        this.nome = nome;
    }

    //Getter e Setter de id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //Getter e Setter de nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

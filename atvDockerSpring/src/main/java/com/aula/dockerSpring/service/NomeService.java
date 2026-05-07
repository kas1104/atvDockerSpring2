package com.aula.dockerSpring.service;

//Bibliotecas e conexões com as demais classes
import com.aula.dockerSpring.dto.NomeDTO;
import com.aula.dockerSpring.entities.NomeEntity;
import com.aula.dockerSpring.repository.NomeRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

//Classe Service
@Service
public class NomeService {

    //Variavel que referencia o repository de nome
    private final NomeRepository nomeRepositoryVariavel;

    //Construtor que injeta dependência na variável
    public NomeService(NomeRepository nomeRepositoryVariavel) {
        this.nomeRepositoryVariavel = nomeRepositoryVariavel;
    }

    //Função que adicionar um nome ao banco de dados
    public void adicionarNome(NomeDTO nomeDTO) {
        NomeEntity nomeEntityVariavel = new NomeEntity();
        nomeEntityVariavel.setNome(nomeDTO.nome());
        nomeRepositoryVariavel.save(nomeEntityVariavel);
    }

    //Função que atualiza os nomes dentro do banco de dados
    @Transactional
    public void atualizarNomes(String nomeAntigo, String nomeNovo){
        List<NomeEntity> listaNomes = nomeRepositoryVariavel.findByNome(nomeAntigo);
        listaNomes.forEach(n -> n.setNome(nomeNovo));
        nomeRepositoryVariavel.saveAll(listaNomes);
    }

    //Função que exclui um nome do banco de dados
    @Transactional
    public void excluirNome(String nome){
        nomeRepositoryVariavel.deleteByNome(nome);
    }

}

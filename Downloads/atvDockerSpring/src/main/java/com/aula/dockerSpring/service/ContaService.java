package com.aula.dockerSpring.service;

//Bibliotecas e coneões com as demais classes
import com.aula.dockerSpring.dto.ContaDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

//Classe Service
@Service
public class ContaService {

    //Varivavel que retorna uma mensagem informando que uma conta foi adicionada
    private static final Logger LOGGER = LoggerFactory.getLogger(ContaService.class);

    //Variáveis da classe service
    List<ContaDTO> contas = new ArrayList<>();

    //Função que retorna os valores da lista
    public List<ContaDTO> buscarContas(){
        LOGGER.info("Procurando...");
        return contas;
    }

    //Função que adiciona um valor a lista
    public String adicionarConta(ContaDTO conta){
        LOGGER.info("Adicionando uma nova conta...");

        contas.add(conta);

        return "Conta -> " + conta + ", adicionada com sucesso!!";
    }
}

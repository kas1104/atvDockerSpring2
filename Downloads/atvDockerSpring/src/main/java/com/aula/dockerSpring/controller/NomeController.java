package com.aula.dockerSpring.controller;

//Bibliotecas e Conexões com as demais classes
import com.aula.dockerSpring.dto.NomeDTO;
import com.aula.dockerSpring.service.NomeService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

//Classe controller
@RestController
@RequestMapping("/nome")
public class NomeController {

    //Variavel que referencia a classe contaService
    public final NomeService nomeServiceVariavel;

    //Construtor que instancia a variável
    public NomeController(NomeService nomeServiceVariavel) {
        this.nomeServiceVariavel = nomeServiceVariavel;
    }

    //Função de alterar o nome do banco de dados
    @PutMapping("/{antigo}/{novo}")
    public ResponseEntity<String> atualizarNome(@PathVariable String antigo, @PathVariable String novo) {

        nomeServiceVariavel.atualizarNomes(antigo, novo);

        return ResponseEntity.ok("nome alterado com sucesso!!!");
    }

    //Função que adiciona um nome do banco de dados
    @PostMapping
    public ResponseEntity<String> adicionarNome(@RequestBody NomeDTO contadtoVariavel){

        nomeServiceVariavel.adicionarNome(contadtoVariavel);

        return ResponseEntity.ok("Nome adicionado com sucesso!!");
    }

    //Função que exclui um nome da lista
    @DeleteMapping("/{nome}")
    public ResponseEntity<String> ExcluirNome(@PathVariable String nome){
        nomeServiceVariavel.excluirNome(nome);

        return ResponseEntity.ok("Nome excluído com sucesso!!!");
    }
}

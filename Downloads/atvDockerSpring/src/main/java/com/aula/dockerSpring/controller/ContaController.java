package com.aula.dockerSpring.controller;

//Bibliotecas e Conexões com as demais classes
import com.aula.dockerSpring.dto.ContaDTO;
import com.aula.dockerSpring.service.ContaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

//Classe controller
@RestController
@RequestMapping("/api/conta")
public class ContaController {

    //Variavel que referencia a classe contaService
    public final ContaService contaServiceVariavel;

    //Construtor que instancia a variável
    public ContaController(ContaService contaServiceVariavel) {
        this.contaServiceVariavel = contaServiceVariavel;
    }

    //Função Get de buscar conta
    @GetMapping
    public ResponseEntity<List<ContaDTO>> buscarConta(){

        return ResponseEntity.ok().body(contaServiceVariavel.buscarContas());
    }

    //Função que adiciona uma conta a List
    @PostMapping
    public ResponseEntity<String> adicionarConta(@RequestBody ContaDTO contadtoVariavel){
        return ResponseEntity.created(URI.create("/api/conta")).body(contaServiceVariavel.adicionarConta(contadtoVariavel));
    }
}

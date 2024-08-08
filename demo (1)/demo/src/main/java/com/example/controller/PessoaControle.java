package com.example.controller;

import com.example.entidades.pessoaEntidade;
import com.example.repositorios.PessoaRepositorio;
import com.example.servicos.PessoaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class PessoaControle {
    @Autowired
    public PessoaServico pessoaServico;
    @GetMapping
    private List<pessoaEntidade> findAll(){
        return pessoaServico.findAll();
    }
    @PostMapping
    private pessoaEntidade criar(@RequestBody pessoaEntidade pessoa){
        return pessoaServico.Criar(pessoa);
    }
}

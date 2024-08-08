package com.example.servicos;

import com.example.entidades.pessoaEntidade;
import com.example.repositorios.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PessoaServico {

    @Autowired
    public PessoaRepositorio pessoaRepositorio;

    public List<pessoaEntidade> findAll(){
        return pessoaRepositorio.findAll();
    }

    public pessoaEntidade Criar(pessoaEntidade pessoa){
        return pessoaRepositorio.save(pessoa);
    }
}

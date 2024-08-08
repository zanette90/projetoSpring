package com.example.repositorios;

import com.example.entidades.pessoaEntidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepositorio extends JpaRepository<pessoaEntidade, Long> {
}

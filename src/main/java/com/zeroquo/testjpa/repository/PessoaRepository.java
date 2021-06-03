package com.zeroquo.testjpa.repository;

import com.zeroquo.testjpa.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}

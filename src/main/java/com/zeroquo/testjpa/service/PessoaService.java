package com.zeroquo.testjpa.service;

import com.zeroquo.testjpa.entity.Pessoa;
import com.zeroquo.testjpa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;

    @Autowired
    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa getById(Long id){
        return pessoaRepository.getById(id);
    }


    public void test(){

        List<Pessoa> all = pessoaRepository.findAll();

        all.forEach(pessoa -> System.out.println(pessoa.getNome()));

    }

}

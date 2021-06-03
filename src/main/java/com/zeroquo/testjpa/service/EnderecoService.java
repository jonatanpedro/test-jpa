package com.zeroquo.testjpa.service;

import com.zeroquo.testjpa.entity.Endereco;
import com.zeroquo.testjpa.entity.IEndereco;
import com.zeroquo.testjpa.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    private EnderecoRepository enderecoRepository;

    @Autowired
    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public void test(){

        IEndereco endereco = enderecoRepository.findEndereco(1L);

        System.out.println(endereco.getCobrancaValor());

    }
}

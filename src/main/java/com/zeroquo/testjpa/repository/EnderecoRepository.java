package com.zeroquo.testjpa.repository;

import com.zeroquo.testjpa.entity.Endereco;
import com.zeroquo.testjpa.entity.IEndereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    @Query("select e.id as enderecoId, e.cep as enderecoCep, c.id as cobrancaId, c.valor as cobrancaValor, p.id as pessoaId " +
            "from Endereco e left join e.cobranca c left join e.pessoa p " +
            "where p.id = :pessoaId")
    IEndereco findEndereco(Long pessoaId);

}

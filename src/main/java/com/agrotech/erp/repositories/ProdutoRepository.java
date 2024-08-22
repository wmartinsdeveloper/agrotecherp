package com.agrotech.erp.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agrotech.erp.entities.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {

    public Optional<Produto> findByNome(String string);


}
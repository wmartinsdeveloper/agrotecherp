package com.agrotech.erp.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agrotech.erp.entities.CategoriaProduto;

@Repository
public interface CategoriaProdutoRepository extends CrudRepository<CategoriaProduto, Long> {

    public Optional<CategoriaProduto> findByNome(String string);


}
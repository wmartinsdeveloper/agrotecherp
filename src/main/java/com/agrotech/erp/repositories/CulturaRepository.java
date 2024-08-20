package com.agrotech.erp.repositories;



import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agrotech.erp.entities.Cultura;

@Repository
public interface CulturaRepository extends CrudRepository<Cultura, Long> {

    public Optional<Cultura> findByNome(String nome);


}

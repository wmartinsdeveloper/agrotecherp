package com.agrotech.erp.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.agrotech.erp.entities.Cultura;
import com.agrotech.erp.entities.enums.unidadePeso;
import com.agrotech.erp.entities.enums.unidadeTempo;
import com.agrotech.erp.repositories.CulturaRepository;


@Configuration
public class DataInicializer  implements CommandLineRunner {

    @Autowired
    private CulturaRepository culturaRepository;

    @Override
    public void run(String... args) throws Exception {
       
        Optional<Cultura> cultura = culturaRepository.findByNome("Maxixe");

        if(!cultura.isPresent()) {
            culturaRepository.save(new Cultura("maxixe", 45, unidadeTempo.DIAS, 30, unidadeTempo.DIAS, true, 0, unidadeTempo.DIAS, 1, unidadeTempo.DIAS, "Tela Verde", 15,unidadePeso.KILOS) );
        }
       


    }





}

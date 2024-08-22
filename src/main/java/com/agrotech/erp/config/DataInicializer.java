package com.agrotech.erp.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.agrotech.erp.entities.Cultura;
import com.agrotech.erp.entities.Enums.UnidadePeso;
import com.agrotech.erp.entities.Enums.UnidadeTempo;
import com.agrotech.erp.repositories.CulturaRepository;


@Configuration
public class DataInicializer  implements CommandLineRunner {

    @Autowired
    private CulturaRepository culturaRepository;

    @Override
    public void run(String... args) throws Exception {
       
        Optional<Cultura> cultura = culturaRepository.findByNome("Maxixe");

        if(!cultura.isPresent()) {
            Cultura aux = new Cultura("Maxixe", 75, UnidadeTempo.DIAS, 60, UnidadeTempo.DIAS, 15, UnidadeTempo.DIAS, true, 1, 0, UnidadeTempo.NA, 3, UnidadeTempo.DIAS, "Tela de 15KG", 15, UnidadePeso.KILOS);
            culturaRepository.save(aux);

        }
       


    }





}

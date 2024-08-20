package com.agrotech.erp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrotech.erp.dto.dtoCultura;
import com.agrotech.erp.entities.Cultura;
import com.agrotech.erp.repositories.CulturaRepository;

@Service
public class CulturaService {

    @Autowired
    private CulturaRepository culturaRepository;

    public Optional<Cultura> findByNome(String nome) {

        return culturaRepository.findByNome(nome);

    }

    // public void save(dtoCultura dtoCultura) {
        
    //     Optional<Cultura> cultura = culturaRepository.findByNome(dtoCultura.nome());
        
    //     cultura.isPresent() ?  
    //         culturaRepository.save(cultura) :
    //         culturaRepository.save(new Cultura(dtoCultura.nome(), dtoCultura.cicloVida(), dtoCultura.unidadeCicloVida(), dtoCultura.inicioProducao(), dtoCultura.unidadeInicioProducao(), dtoCultura.safraUnica(), dtoCultura.intervaloEntreSafra(), dtoCultura.unidadeEntreSafra(), dtoCultura.intervaloColheita(), dtoCultura.unidadeIntervaloColheita(), dtoCultura.embalagemVenda(), dtoCultura.pesoVenda(), dtoCultura.unidadePeso());
    

    //     }
    

        public void save(dtoCultura dtoCultura) {
            Optional<Cultura> culturaOptional = culturaRepository.findByNome(dtoCultura.nome());
            
            if(culturaOptional.isPresent()) {
                Cultura cultura = culturaOptional.get();
                culturaRepository.save(cultura);
            } else {
                Cultura newCultura = new Cultura(dtoCultura.nome(), dtoCultura.cicloVida(), dtoCultura.unidadeCicloVida(), dtoCultura.inicioProducao(), dtoCultura.unidadeInicioProducao(), dtoCultura.safraUnica(), dtoCultura.intervaloEntreSafra(), dtoCultura.unidadeEntreSafra(), dtoCultura.intervaloColheita(), dtoCultura.unidadeIntervaloColheita(), dtoCultura.embalagemVenda(), dtoCultura.pesoVenda(), dtoCultura.unidadePeso());
                culturaRepository.save(newCultura);
            }
        }        





}


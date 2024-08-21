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

    public Optional<Cultura> findByNome(String nome) throws Exception {

    try{
        Optional<Cultura> cultura = culturaRepository.findByNome(nome);
        return cultura.isPresent() ? cultura : null;
    }catch(Exception e) 
    {
        throw new Exception("<h1>Error to save the information! </h1></br>" + e.getMessage());
          
    } 
    }

    public void save(dtoCultura dtoCultura) throws Exception {
        Optional<Cultura> culturaOptional = culturaRepository.findByNome(dtoCultura.nome());
        
        try{
            if(culturaOptional.isPresent()) {
                Cultura cultura = culturaOptional.get();
                cultura.setNome(dtoCultura.nome()); 
                cultura.setCicloVida(dtoCultura.cicloVida());
                cultura.setUnidadeCicloVida(dtoCultura.unidadeCicloVida());
                cultura.setInicioProducao(dtoCultura.inicioProducao());
                cultura.setUnidadeInicioProducao(dtoCultura.unidadeInicioProducao());
                cultura.setSafraUnica(dtoCultura.safraUnica());
                cultura.setIntervaloEntreSafra(dtoCultura.intervaloEntreSafra());
                cultura.setUnidadeEntreSafra(dtoCultura.unidadeEntreSafra());
                cultura.setIntervaloColheita(dtoCultura.intervaloColheita());
                cultura.setUnidadeIntervaloColheita(dtoCultura.unidadeIntervaloColheita());
                cultura.setEmbalagemVenda(dtoCultura.embalagemVenda());
                cultura.setPesoVenda(dtoCultura.pesoVenda());
                cultura.setUnidadePeso(dtoCultura.unidadePeso());
                culturaRepository.save(cultura);

            } else {
                Cultura newCultura = new Cultura(dtoCultura.nome(), dtoCultura.cicloVida(), dtoCultura.unidadeCicloVida(), dtoCultura.inicioProducao(), dtoCultura.unidadeInicioProducao(), dtoCultura.safraUnica(), dtoCultura.intervaloEntreSafra(), dtoCultura.unidadeEntreSafra(), dtoCultura.intervaloColheita(), dtoCultura.unidadeIntervaloColheita(), dtoCultura.embalagemVenda(), dtoCultura.pesoVenda(), dtoCultura.unidadePeso());
                culturaRepository.save(newCultura);
            }
        }catch(Exception e) 
        {
            throw new Exception("<h1>Error to save the information! </h1></br>" + e.getMessage());
              
        }


    }

    public Iterable<Cultura> listar() {
         return  culturaRepository.findAll();
    }

    public void delete(String nome) throws Exception {
        try{    
            Optional<Cultura> cultura = culturaRepository.findByNome(nome);
            if(cultura!= null){
                culturaRepository.delete(cultura.get()); 
            }  
        }catch(Exception e) 
        {
            throw new Exception("<h1>Error to delete the information! </h1></br>" + e.getMessage());
              
        }
    }







}


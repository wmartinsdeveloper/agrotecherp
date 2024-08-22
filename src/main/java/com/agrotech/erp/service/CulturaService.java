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
        Optional<Cultura> culturaOptional = culturaRepository.findByNome(dtoCultura.Nome());
        
        try{
            if(culturaOptional.isPresent()) {
                Cultura cultura = culturaOptional.get();
                cultura.setnome(dtoCultura.Nome()); 
                cultura.setCicloVida(dtoCultura.CicloVida());
                cultura.setUnidadeCicloVida(dtoCultura.UnidadeCicloVida());
                cultura.setInicioProducao(dtoCultura.InicioProducao());
                cultura.setUnidadeInicioProducao(dtoCultura.UnidadeInicioProducao());
                cultura.setCicloProducao(dtoCultura.CicloProducao());
                cultura.setUnidadeCicloProducao(dtoCultura.UnidadeCicloProducao());
                cultura.setSafraUnica(dtoCultura.SafraUnica());
                cultura.setQuantidadeSafra(dtoCultura.QuantidadeSafra());
                cultura.setIntervaloEntreSafra(dtoCultura.IntervaloEntreSafra());
                cultura.setUnidadeEntreSafra(dtoCultura.UnidadeEntreSafra());
                cultura.setIntervaloColheita(dtoCultura.IntervaloColheita());
                cultura.setUnidadeIntervaloColheita(dtoCultura.UnidadeIntervaloColheita());
                cultura.setEmbalagemVenda(dtoCultura.EmbalagemVenda());
                cultura.setPesoVenda(dtoCultura.PesoVenda());
                cultura.setUnidadePeso(dtoCultura.UnidadePeso());
                culturaRepository.save(cultura);

            } else {
                Cultura newCultura = new Cultura(dtoCultura.Nome(),
                                                 dtoCultura.CicloVida(),
                                                 dtoCultura.UnidadeCicloVida(), 
                                                 dtoCultura.InicioProducao(), 
                                                 dtoCultura.UnidadeInicioProducao(),
                                                 dtoCultura.CicloProducao(),
                                                 dtoCultura.UnidadeCicloProducao(), 
                                                 dtoCultura.SafraUnica(), 
                                                 dtoCultura.QuantidadeSafra(),
                                                 dtoCultura.IntervaloEntreSafra(), 
                                                 dtoCultura.UnidadeEntreSafra(), 
                                                 dtoCultura.IntervaloColheita(), 
                                                 dtoCultura.UnidadeIntervaloColheita(), 
                                                 dtoCultura.EmbalagemVenda(), 
                                                 dtoCultura.PesoVenda(), 
                                                 dtoCultura.UnidadePeso());
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


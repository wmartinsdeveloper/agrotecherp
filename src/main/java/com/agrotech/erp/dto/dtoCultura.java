package com.agrotech.erp.dto;

import com.agrotech.erp.entities.enums.unidadePeso;
import com.agrotech.erp.entities.enums.unidadeTempo;

public record dtoCultura(String nome,int cicloVida,unidadeTempo unidadeCicloVida,int inicioProducao,unidadeTempo unidadeInicioProducao,Boolean safraUnica,int intervaloEntreSafra,unidadeTempo unidadeEntreSafra,
int intervaloColheita,unidadeTempo unidadeIntervaloColheita,String embalagemVenda,int pesoVenda,unidadePeso unidadePeso)
{}

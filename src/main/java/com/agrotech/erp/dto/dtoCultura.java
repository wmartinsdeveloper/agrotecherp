package com.agrotech.erp.dto;

import com.agrotech.erp.entities.Enums.UnidadePeso;
import com.agrotech.erp.entities.Enums.UnidadeTempo;

public record dtoCultura(
String Nome,
int CicloVida,
UnidadeTempo UnidadeCicloVida,
int InicioProducao,
UnidadeTempo UnidadeInicioProducao,
int CicloProducao, 
UnidadeTempo UnidadeCicloProducao,    
boolean SafraUnica,
int QuantidadeSafra, 
UnidadeTempo UnidadeTempoQuantidadeSafra,
int IntervaloEntreSafra,
UnidadeTempo UnidadeEntreSafra,    
int IntervaloColheita,
UnidadeTempo UnidadeIntervaloColheita,   
String EmbalagemVenda,    
int PesoVenda,   
UnidadePeso UnidadePeso)
{}


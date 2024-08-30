package com.agrotech.erp.entities;

import java.util.Date;
import java.util.Set;

import com.agrotech.erp.entities.Enums.UnidadeMedida;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "plantio")
public class Plantio {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dataInicial;

    private Date dataFinal;

    private String nomeArea;

    private String descricaoArea;

    private int area;

    private UnidadeMedida medidaArea;

    private Set<Manejo> manejo;

    private Set<Producao> producao; 

    




    
}

package com.agrotech.erp.entities;

import java.util.Date;

import com.agrotech.erp.entities.Enums.UnidadeVenda;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producao")
public class Producao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date data;

    private int quantidade;

    private UnidadeVenda unidade; 

    

}

package com.agrotech.erp.entities;

import java.util.Date;

import com.agrotech.erp.entities.Enums.UnidadeVenda;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "producao")
public class Producao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date data;

    private int quantidade;

    @Enumerated(EnumType.STRING)
    private UnidadeVenda unidade; 

    @ManyToOne
    private Plantio plantio;

    public Producao() {
    }

    public Producao(Date data, int quantidade, UnidadeVenda unidade, Plantio plantio) {
        this.data = data;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.plantio = plantio;
    }

    public Long getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public UnidadeVenda getUnidade() {
        return unidade;
    }

    public void setUnidade(UnidadeVenda unidade) {
        this.unidade = unidade;
    }

    public Plantio getPlantio() {
        return plantio;
    }

    public void setPlantio(Plantio plantio) {
        this.plantio = plantio;
    }



}

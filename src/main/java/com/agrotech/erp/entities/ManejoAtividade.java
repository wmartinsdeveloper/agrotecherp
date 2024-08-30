package com.agrotech.erp.entities;

import com.agrotech.erp.entities.Enums.UnidadePeso;
import com.agrotech.erp.entities.Enums.UnidadeTempo;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;


@Entity(name="manejoatividade")
public class ManejoAtividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique= true)
    private int intervaloTempo;

    @Column(unique= true)
    private UnidadeTempo unidadeTempo;
    
    @Column(unique= true)
    private int quantidade;

    @Column(unique= true)
    private UnidadePeso unidadePeso;

    @ManyToOne
    private Manejo manejo;


    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "produto_id", referencedColumnName = "id")
    private Produto produto;

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "servico_id", referencedColumnName = "id")
    private Servico servico;

    public ManejoAtividade() {
    }

    public ManejoAtividade(int intervaloTempo, UnidadeTempo unidadeTempo, int quantidade, UnidadePeso unidadePeso,
            Manejo manejo, Produto produto, Servico servico) {
        this.intervaloTempo = intervaloTempo;
        this.unidadeTempo = unidadeTempo;
        this.quantidade = quantidade;
        this.unidadePeso = unidadePeso;
        this.manejo = manejo;
        this.produto = produto;
        this.servico = servico;
    }

    public Long getId() {
        return id;
    }

    public int getIntervaloTempo() {
        return intervaloTempo;
    }

    public void setIntervaloTempo(int intervaloTempo) {
        this.intervaloTempo = intervaloTempo;
    }

    public UnidadeTempo getUnidadeTempo() {
        return unidadeTempo;
    }

    public void setUnidadeTempo(UnidadeTempo unidadeTempo) {
        this.unidadeTempo = unidadeTempo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public UnidadePeso getUnidadePeso() {
        return unidadePeso;
    }

    public void setUnidadePeso(UnidadePeso unidadePeso) {
        this.unidadePeso = unidadePeso;
    }

    public Manejo getManejo() {
        return manejo;
    }

    public void setManejo(Manejo manejo) {
        this.manejo = manejo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }



    

}

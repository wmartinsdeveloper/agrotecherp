package com.agrotech.erp.entities;

import com.agrotech.erp.entities.enums.unidadePeso;
import com.agrotech.erp.entities.enums.unidadeTempo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "cultura")
public class Cultura {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é uma informação obrigatória.")
    @Column(name = "nome", unique = true)
    private String nome;

    @Column(name = "cicloVida")
    private int cicloVida;

    @Column(name = "unidadeCicloVida")
    private unidadeTempo unidadeCicloVida;


    @Column(name = "inicioProducao")
    private int inicioProducao;


    @Column(name = "unidadeInicioProducao")
    private unidadeTempo unidadeInicioProducao;
    

    @Column(name = "safraUnica")    
    private boolean safraUnica;


    @Column(name = "tempoEntreSafra")    
    private int intervaloEntreSafra;


    @Column(name = "unidadeEntreSafra")
    private unidadeTempo unidadeEntreSafra;    


    @Column(name = "intervaloColheita")    
    private int intervaloColheita;


    @Column(name = "unidadeIntervaloColheita")
    private unidadeTempo unidadeIntervaloColheita;   


    @Column(name = "embalagemVenda")    
    private String embalagemVenda;    


    @Column(name = "pesoVenda")    
    private int pesoVenda;   


    @Column(name = "unidadePeso")    
    private unidadePeso unidadePeso;

    public Cultura() {
    }

    public Cultura(String nome,
             int cicloVida,
            unidadeTempo unidadeCicloVida,
            int inicioProducao,
            unidadeTempo unidadeInicioProducao,
            Boolean safraUnica,
            int intervaloEntreSafra,
            unidadeTempo unidadeEntreSafra,
            int intervaloColheita,
            unidadeTempo unidadeIntervaloColheita,
            String embalagemVenda,
            int pesoVenda,
            unidadePeso unidadePeso) {
        this.nome = nome;
        this.cicloVida = cicloVida;
        this.unidadeCicloVida = unidadeCicloVida;
        this.inicioProducao = inicioProducao;
        this.unidadeInicioProducao = unidadeInicioProducao;
        this.safraUnica = safraUnica;
        this.intervaloEntreSafra = intervaloEntreSafra;
        this.unidadeEntreSafra = unidadeEntreSafra;
        this.intervaloColheita = intervaloColheita;
        this.unidadeIntervaloColheita = unidadeIntervaloColheita;
        this.embalagemVenda = embalagemVenda;
        this.pesoVenda = pesoVenda;
        this.unidadePeso = unidadePeso;
    }


    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCicloVida() {
        return cicloVida;
    }

    public void setCicloVida(int cicloVida) {
        this.cicloVida = cicloVida;
    }

    public unidadeTempo getUnidadeCicloVida() {
        return unidadeCicloVida;
    }

    public void setUnidadeCicloVida(unidadeTempo unidadeCicloVida) {
        this.unidadeCicloVida = unidadeCicloVida;
    }

    public int getInicioProducao() {
        return inicioProducao;
    }

    public void setInicioProducao(int inicioProducao) {
        this.inicioProducao = inicioProducao;
    }

    public unidadeTempo getUnidadeInicioProducao() {
        return unidadeInicioProducao;
    }

    public void setUnidadeInicioProducao(unidadeTempo unidadeInicioProducao) {
        this.unidadeInicioProducao = unidadeInicioProducao;
    }

    public boolean isSafraUnica() {
        return safraUnica;
    }

    public void setSafraUnica(boolean safraUnica) {
        this.safraUnica = safraUnica;
    }

    public int getIntervaloEntreSafra() {
        return intervaloEntreSafra;
    }

    public void setIntervaloEntreSafra(int intervaloEntreSafra) {
        this.intervaloEntreSafra = intervaloEntreSafra;
    }

    public unidadeTempo getUnidadeEntreSafra() {
        return unidadeEntreSafra;
    }

    public void setUnidadeEntreSafra(unidadeTempo unidadeEntreSafra) {
        this.unidadeEntreSafra = unidadeEntreSafra;
    }

    public int getIntervaloColheita() {
        return intervaloColheita;
    }

    public void setIntervaloColheita(int intervaloColheita) {
        this.intervaloColheita = intervaloColheita;
    }

    public unidadeTempo getUnidadeIntervaloColheita() {
        return unidadeIntervaloColheita;
    }

    public void setUnidadeIntervaloColheita(unidadeTempo unidadeIntervaloColheita) {
        this.unidadeIntervaloColheita = unidadeIntervaloColheita;
    }

    public String getEmbalagemVenda() {
        return embalagemVenda;
    }

    public void setEmbalagemVenda(String embalagemVenda) {
        this.embalagemVenda = embalagemVenda;
    }

    public int getPesoVenda() {
        return pesoVenda;
    }

    public void setPesoVenda(int pesoVenda) {
        this.pesoVenda = pesoVenda;
    }

    public unidadePeso getUnidadePeso() {
        return unidadePeso;
    }

    public void setUnidadePeso(unidadePeso unidadePeso) {
        this.unidadePeso = unidadePeso;
    }

    @Override
    public String toString() {
        return "Cultura [id=" + id + ", nome=" + nome + ", cicloVida=" + cicloVida + ", unidadeCicloVida="
                + unidadeCicloVida + ", inicioProducao=" + inicioProducao + ", unidadeInicioProducao="
                + unidadeInicioProducao + ", safraUnica=" + safraUnica + ", intervaloEntreSafra=" + intervaloEntreSafra
                + ", unidadeEntreSafra=" + unidadeEntreSafra + ", intervaloColheita=" + intervaloColheita
                + ", unidadeIntervaloColheita=" + unidadeIntervaloColheita + ", embalagemVenda=" + embalagemVenda
                + ", pesoVenda=" + pesoVenda + ", unidadePeso=" + unidadePeso + "]";
    }  


  


    

}

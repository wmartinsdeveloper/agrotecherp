package com.agrotech.erp.entities;

import java.util.Date;
import java.util.Set;

import com.agrotech.erp.entities.Enums.UnidadeMedida;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "manejo_id", referencedColumnName = "id")
    private Manejo manejo;

    @JsonIgnore
    @OneToMany(mappedBy = "plantio", fetch = FetchType.EAGER)    
    private Set<Producao> producao;

    public Plantio() {
    }

    public Plantio(Date dataInicial, Date dataFinal, String nomeArea, String descricaoArea, int area,
            UnidadeMedida medidaArea, Manejo manejo, Set<Producao> producao) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.nomeArea = nomeArea;
        this.descricaoArea = descricaoArea;
        this.area = area;
        this.medidaArea = medidaArea;
        this.manejo = manejo;
        this.producao = producao;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getNomeArea() {
        return nomeArea;
    }

    public void setNomeArea(String nomeArea) {
        this.nomeArea = nomeArea;
    }

    public String getDescricaoArea() {
        return descricaoArea;
    }

    public void setDescricaoArea(String descricaoArea) {
        this.descricaoArea = descricaoArea;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public UnidadeMedida getMedidaArea() {
        return medidaArea;
    }

    public void setMedidaArea(UnidadeMedida medidaArea) {
        this.medidaArea = medidaArea;
    }

    public Manejo getManejo() {
        return manejo;
    }

    public void setManejo(Manejo manejo) {
        this.manejo = manejo;
    }

    public Set<Producao> getProducao() {
        return producao;
    }

    public void setProducao(Set<Producao> producao) {
        this.producao = producao;
    } 



    

    




    
}

package com.agrotech.erp.entities;

import java.util.Date;
import java.util.Set;

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
@Table(name = "manejo")
public class Manejo {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Date data;

    private String nome;

    private String descricao;


    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cultura_id", referencedColumnName = "id")
    private Cultura cultura;

    @JsonIgnore
    @OneToMany(mappedBy = "manejo", fetch = FetchType.EAGER)
    private Set<ManejoAtividadeProduto> manejoAtividadeProduto;

    @JsonIgnore
    @OneToMany(mappedBy = "manejo", fetch = FetchType.EAGER)
    private Set<ManejoAtividadeServico> manejoAtividadeServico;    

    public Manejo() {
    }

    public Manejo(String nome, String descricao, Cultura cultura, Set<ManejoAtividadeProduto> manejoAtividadeProduto,
            Set<ManejoAtividadeServico> manejoAtividadeServico) {
        this.nome = nome;
        this.descricao = descricao;
        this.cultura = cultura;
        this.manejoAtividadeProduto = manejoAtividadeProduto;
        this.manejoAtividadeServico = manejoAtividadeServico;
    }


    public Manejo(String nome, String descricao, Cultura cultura, Set<ManejoAtividadeServico> manejoAtividadeServico) {
        this.nome = nome;
        this.descricao = descricao;
        this.cultura = cultura;
        this.manejoAtividadeServico = manejoAtividadeServico;
    }

    public Manejo(String nome, String descricao, Cultura cultura) {
        this.nome = nome;
        this.descricao = descricao;
        this.cultura = cultura;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cultura getCultura() {
        return cultura;
    }

    public void setCultura(Cultura cultura) {
        this.cultura = cultura;
    }

    public Set<ManejoAtividadeProduto> getManejoAtividadeProduto() {
        return manejoAtividadeProduto;
    }

    public void setManejoAtividadeProduto(Set<ManejoAtividadeProduto> manejoAtividadeProduto) {
        this.manejoAtividadeProduto = manejoAtividadeProduto;
    }

    public Set<ManejoAtividadeServico> getManejoAtividadeServico() {
        return manejoAtividadeServico;
    }

    public void setManejoAtividadeServico(Set<ManejoAtividadeServico> manejoAtividadeServico) {
        this.manejoAtividadeServico = manejoAtividadeServico;
    }

    @Override
    public String toString() {
        return "Manejo [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", cultura=" + cultura
                + ", manejoAtividadeProduto=" + manejoAtividadeProduto + ", manejoAtividadeServico="
                + manejoAtividadeServico + "]";
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }







    

}

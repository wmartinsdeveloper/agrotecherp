package com.agrotech.erp.entities;

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

@Entity(name="manejo")
public class Manejo {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cultura_id", referencedColumnName = "id")
    private Cultura cultura;

    @JsonIgnore
    @OneToMany(mappedBy = "manejo", fetch = FetchType.EAGER)
    private Set<ManejoAtividade> manejoAtividade;

    public Manejo() {
    }

    public Manejo(String nome, String descricao, Cultura cultura, Set<ManejoAtividade> manejoAtividade) {
        this.nome = nome;
        this.descricao = descricao;
        this.cultura = cultura;
        this.manejoAtividade = manejoAtividade;
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

    public Set<ManejoAtividade> getManejoAtividade() {
        return manejoAtividade;
    }

    public void setManejoAtividade(Set<ManejoAtividade> manejoAtividade) {
        this.manejoAtividade = manejoAtividade;
    }


    


    

}

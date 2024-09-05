package com.agrotech.erp.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ManejoAtividadeServico")
public class ManejoAtividadeServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Manejo manejo;

    private Date data;

    private String nome; 

    private String descricao; 

    private String observacao; 
   
    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "servico_id", referencedColumnName = "id")
    private Servico servico;

    private int quantidadeUtilizada;

    private boolean custoFracionario; 

    private double valorCusto;

    public ManejoAtividadeServico() {
    }

    public ManejoAtividadeServico(Manejo manejo, String nome, String descricao, String observacao, Servico servico,
            int quantidadeUtilizada, boolean custoFracionario, double valorCusto) {
        this.manejo = manejo;
        this.nome = nome;
        this.descricao = descricao;
        this.observacao = observacao;
        this.servico = servico;
        this.quantidadeUtilizada = quantidadeUtilizada;
        this.custoFracionario = custoFracionario;
        this.valorCusto = valorCusto;
    }

    public Long getId() {
        return id;
    }

    public Manejo getManejo() {
        return manejo;
    }

    public void setManejo(Manejo manejo) {
        this.manejo = manejo;
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

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public int getQuantidadeUtilizada() {
        return quantidadeUtilizada;
    }

    public void setQuantidadeUtilizada(int quantidadeUtilizada) {
        this.quantidadeUtilizada = quantidadeUtilizada;
    }

    public boolean isCustoFracionario() {
        return custoFracionario;
    }

    public void setCustoFracionario(boolean custoFracionario) {
        this.custoFracionario = custoFracionario;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
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

package com.agrotech.erp.entities;

import java.util.Date;
import java.util.List;

import com.agrotech.erp.entities.Enums.TipoCusto;
import com.agrotech.erp.entities.Enums.TipoInvestimento;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="servico")
public class Servico {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date data;

    private String nome;

    private String descricao;

    private String responsavel;

    private String nomeTerceiro;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoInvestimento")
    private TipoInvestimento tipoInvestimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoCusto")
    private TipoCusto tipoCusto; 

    @JsonIgnore
    @OneToMany(mappedBy = "servico", fetch = FetchType.EAGER)    
    private List<PrecoServico> precoServico;    
    
    public Servico() {
    }

    public Servico(Date data, String nome, String descricao, String responsavel, String nomeTerceiro,
            TipoInvestimento tipoInvestimento, TipoCusto tipoCusto, List<PrecoServico> precoServico) {
        this.data = data;
        this.nome = nome;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.nomeTerceiro = nomeTerceiro;
        this.tipoInvestimento = tipoInvestimento;
        this.tipoCusto = tipoCusto;
        this.precoServico = precoServico;
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

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getNomeTerceiro() {
        return nomeTerceiro;
    }

    public void setNomeTerceiro(String nomeTerceiro) {
        this.nomeTerceiro = nomeTerceiro;
    }

    public TipoInvestimento getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(TipoInvestimento tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public TipoCusto getTipoCusto() {
        return tipoCusto;
    }

    public void setTipoCusto(TipoCusto tipoCusto) {
        this.tipoCusto = tipoCusto;
    }

    public List<PrecoServico> getPrecoServico() {
        return precoServico;
    }

    public void setPrecoServico(List<PrecoServico> precoServico) {
        this.precoServico = precoServico;
    }

    @Override
    public String toString() {
        return "Servico [id=" + id + ", data=" + data + ", nome=" + nome + ", descricao=" + descricao + ", responsavel="
                + responsavel + ", nomeTerceiro=" + nomeTerceiro + ", tipoInvestimento=" + tipoInvestimento
                + ", tipoCusto=" + tipoCusto + ", precoServico=" + precoServico + "]";
    }



    


}

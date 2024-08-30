package com.agrotech.erp.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="servico")
public class Servico {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private String responsavel;
    private String nomeTerceiro;
    private Date data;
    private double valor;
    private int quantidade;
    private double total;
    
    public Servico() {
    }

    public Servico(String nome, String descricao, String responsavel, String nomeTerceiro, Date data, double valor,
            int quantidade, double total) {
        this.nome = nome;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.nomeTerceiro = nomeTerceiro;
        this.data = data;
        this.valor = valor;
        this.quantidade = quantidade;
        this.total = total;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Servico [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", responsavel=" + responsavel
                + ", nomeTerceiro=" + nomeTerceiro + ", data=" + data + ", valor=" + valor + ", quantidade="
                + quantidade + ", total=" + total + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Servico other = (Servico) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    


}

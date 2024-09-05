package com.agrotech.erp.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "CategoriaProduto")
public class CategoriaProduto {

    /* Entidade para cadastro dos tipos de produtos como:
     * Inseticidas, bactericidas, Adubação Foliar, Fungicidas ..
     */

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nome", unique = true )
    private String nome;

    @Column(name="descricao")
    private String descricao;

    @JsonIgnore
    @ManyToMany(mappedBy = "categoriaProduto")
    private List<Produto> produto;

    public CategoriaProduto(){}

    public CategoriaProduto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public CategoriaProduto(String nome, String descricao, List<Produto> produto) {
        this.nome = nome;
        this.descricao = descricao;
        this.produto = produto;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "CategoriaProduto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", produto=" + produto
                + "]";
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
        CategoriaProduto other = (CategoriaProduto) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }



    
  

}

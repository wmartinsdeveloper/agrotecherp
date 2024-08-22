package com.agrotech.erp.entities;

import java.util.Date;
import java.util.Set;

import com.agrotech.erp.entities.Enums.TipoCompra;
import com.agrotech.erp.entities.Enums.UnidadePeso;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dataAquisicao", unique = true)
    private Date dataAquisicao;	 

    @Column(name = "nome", unique = true    )
    private String nome;

    @Column(name = "descricao")    
    private String descricao;
    
    @Column(name = "peso")
    private int peso;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "unidadePeso")
    private UnidadePeso unidadePeso;

    @Column(name = "quantidade")    
    private int quantidade;

    @Column(name = "preco")    
    private double preco;

    @Column(name = "precoMedida")    //calculado
    private double precoMedidda;

    @Column(name = "desconto")
    private double desconto;

    @Column(name = "precoTotal")
    private double precoTotal;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoCompra")
    private TipoCompra tipoCompra;
   
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Produto_Categoria", joinColumns = @JoinColumn(name = "produto_id"), inverseJoinColumns = @JoinColumn(name = "categoria_produto_id"))
    private Set<CategoriaProduto> categoriaProduto;

    public Produto(){}


    public Produto(Date dataAquisicao, String nome, String descricao, int peso, UnidadePeso unidadePeso, int quantidade,
            double preco, double precoMedidda, double desconto, double precoTotal, TipoCompra tipoCompra) {
        this.dataAquisicao = dataAquisicao;
        this.nome = nome;
        this.descricao = descricao;
        this.peso = peso;
        this.unidadePeso = unidadePeso;
        this.quantidade = quantidade;
        this.preco = preco;
        this.precoMedidda = precoMedidda;
        this.desconto = desconto;
        this.precoTotal = precoTotal;
        this.tipoCompra = tipoCompra;
    }

    

    public Produto(Date dataAquisicao, String nome, String descricao, int peso, UnidadePeso unidadePeso, int quantidade,
            double preco, double precoMedidda, double desconto, double precoTotal, TipoCompra tipoCompra,
            Set<CategoriaProduto> categoriaProduto) {
        this.dataAquisicao = dataAquisicao;
        this.nome = nome;
        this.descricao = descricao;
        this.peso = peso;
        this.unidadePeso = unidadePeso;
        this.quantidade = quantidade;
        this.preco = preco;
        this.precoMedidda = precoMedidda;
        this.desconto = desconto;
        this.precoTotal = precoTotal;
        this.tipoCompra = tipoCompra;
        this.categoriaProduto = categoriaProduto;
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

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public UnidadePeso getUnidadePeso() {
        return unidadePeso;
    }

    public void setUnidadePeso(UnidadePeso unidadePeso) {
        this.unidadePeso = unidadePeso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoMedidda() {
        return precoMedidda;
    }

    public void setPrecoMedidda(double precoMedidda) {
        this.precoMedidda = precoMedidda;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }


    public TipoCompra getTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(TipoCompra tipoCompra) {
        this.tipoCompra = tipoCompra;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "Produto [id=" + id + ", dataAquisicao=" + dataAquisicao + ", nome=" + nome + ", descricao=" + descricao
                + ", peso=" + peso + ", unidadePeso=" + unidadePeso + ", quantidade=" + quantidade + ", preco=" + preco
                + ", precoMedidda=" + precoMedidda + ", desconto=" + desconto + ", precoTotal=" + precoTotal
                + ", tipoCompra=" + tipoCompra + "]";
    }


    public Set<CategoriaProduto> getCategoriaProduto() {
        return categoriaProduto;
    }


    public void setCategoriaProduto(Set<CategoriaProduto> categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }


    


    
}


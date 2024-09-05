package com.agrotech.erp.entities;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.agrotech.erp.entities.Enums.TipoCusto;
import com.agrotech.erp.entities.Enums.TipoInvestimento;
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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data", unique = true)
    private Date data;	 

    @Column(name = "codigo")    
    private String codigo;

    @Column(name = "nome", unique = true    )
    private String nome;

    @Column(name = "descricao")    
    private String descricao;
    
    @Column(name = "peso")
    private int peso;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "unidadePeso")
    private UnidadePeso unidadePeso;

     @Enumerated(EnumType.STRING)
    @Column(name = "tipoInvestimento")
    private TipoInvestimento tipoInvestimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoCusto")
    private TipoCusto tipoCusto; 
   
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ProdutoCategoria", joinColumns = @JoinColumn(name = "produto_id"), inverseJoinColumns = @JoinColumn(name = "categoria_produto_id"))
    private Set<CategoriaProduto> categoriaProduto;

    @JsonIgnore
    @OneToMany(mappedBy = "produto", fetch = FetchType.EAGER)    
    private List<PrecoProduto> precoProduto;    


    public Produto(){}


    public Produto(Date data, String codigo, String nome, String descricao, int peso, UnidadePeso unidadePeso,
            TipoInvestimento tipoInvestimento, TipoCusto tipoCusto, Set<CategoriaProduto> categoriaProduto) {
        this.data = data;
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.peso = peso;
        this.unidadePeso = unidadePeso;
        this.tipoInvestimento = tipoInvestimento;
        this.tipoCusto = tipoCusto;
        this.categoriaProduto = categoriaProduto;
    }


    public static long getSerialversionuid() {
        return serialVersionUID;
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


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
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


    public Set<CategoriaProduto> getCategoriaProduto() {
        return categoriaProduto;
    }


    public void setCategoriaProduto(Set<CategoriaProduto> categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }


    public List<PrecoProduto> getPrecoProduto() {
        return precoProduto;
    }


    public void setPrecoProduto(List<PrecoProduto> precoProduto) {
        this.precoProduto = precoProduto;
    }




    
}


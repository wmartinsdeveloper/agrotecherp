package com.agrotech.erp.entities;

import com.agrotech.erp.entities.Enums.UnidadePeso;
import com.agrotech.erp.entities.Enums.UnidadeTempo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cultura")
public class Cultura {

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", unique = true)
    private String nome;

    @Column(name = "CicloVida")
    private int CicloVida;

    @Enumerated(EnumType.STRING)
    @Column(name = "UnidadeCicloVida")
    private UnidadeTempo UnidadeCicloVida;

    @Column(name = "InicioProducao")
    private int InicioProducao;

    @Enumerated(EnumType.STRING)
    @Column(name = "UnidadeInicioProducao")
    private UnidadeTempo UnidadeInicioProducao;
    
    @Column(name = "CicloProducao")
    private int CicloProducao; 

    @Enumerated(EnumType.STRING)
    @Column(name = "UnidadeCicloProducao")
    private UnidadeTempo UnidadeCicloProducao;    

    @Column(name = "SafraUnica")    
    private boolean SafraUnica;

    @Column(name="QuantidadeSafra")
    private int QuantidadeSafra;

    @Column(name = "IntervaloEntreSafra")    
    private int IntervaloEntreSafra;

    @Enumerated(EnumType.STRING)
    @Column(name = "UnidadeEntreSafra")
    private UnidadeTempo UnidadeEntreSafra;    

    @Column(name = "IntervaloColheita")    
    private int IntervaloColheita;

    @Enumerated(EnumType.STRING)
    @Column(name = "UnidadeIntervaloColheita")
    private UnidadeTempo UnidadeIntervaloColheita;   

    @Column(name = "EmbalagemVenda")    
    private String EmbalagemVenda;    

    @Column(name = "PesoVenda")    
    private int PesoVenda;   

    @Enumerated(EnumType.STRING)
    @Column(name = "UnidadePeso")    
    private UnidadePeso UnidadePeso;

    
    public Cultura(){}

    public Cultura(String Nome, int cicloVida,
            UnidadeTempo unidadeCicloVida, int inicioProducao, UnidadeTempo unidadeInicioProducao, int cicloProducao,
            UnidadeTempo unidadeCicloProducao, boolean safraUnica, int quantidadeSafra,
            int intervaloEntreSafra, UnidadeTempo unidadeEntreSafra,
            int intervaloColheita, UnidadeTempo unidadeIntervaloColheita, String embalagemVenda, int pesoVenda,
            com.agrotech.erp.entities.Enums.UnidadePeso unidadePeso) {
        nome = Nome;
        CicloVida = cicloVida;
        UnidadeCicloVida = unidadeCicloVida;
        InicioProducao = inicioProducao;
        UnidadeInicioProducao = unidadeInicioProducao;
        CicloProducao = cicloProducao;
        UnidadeCicloProducao = unidadeCicloProducao;
        SafraUnica = safraUnica;
        QuantidadeSafra = quantidadeSafra;
        IntervaloEntreSafra = intervaloEntreSafra;
        UnidadeEntreSafra = unidadeEntreSafra;
        IntervaloColheita = intervaloColheita;
        UnidadeIntervaloColheita = unidadeIntervaloColheita;
        EmbalagemVenda = embalagemVenda;
        PesoVenda = pesoVenda;
        UnidadePeso = unidadePeso;
    }

    public Long getId() {
        return id;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String Nome) {
        nome = Nome;
    }

    public int getCicloVida() {
        return CicloVida;
    }

    public void setCicloVida(int cicloVida) {
        CicloVida = cicloVida;
    }

    public UnidadeTempo getUnidadeCicloVida() {
        return UnidadeCicloVida;
    }

    public void setUnidadeCicloVida(UnidadeTempo unidadeCicloVida) {
        UnidadeCicloVida = unidadeCicloVida;
    }

    public int getInicioProducao() {
        return InicioProducao;
    }

    public void setInicioProducao(int inicioProducao) {
        InicioProducao = inicioProducao;
    }

    public UnidadeTempo getUnidadeInicioProducao() {
        return UnidadeInicioProducao;
    }

    public void setUnidadeInicioProducao(UnidadeTempo unidadeInicioProducao) {
        UnidadeInicioProducao = unidadeInicioProducao;
    }

    public int getCicloProducao() {
        return CicloProducao;
    }

    public void setCicloProducao(int cicloProducao) {
        CicloProducao = cicloProducao;
    }

    public UnidadeTempo getUnidadeCicloProducao() {
        return UnidadeCicloProducao;
    }

    public void setUnidadeCicloProducao(UnidadeTempo unidadeCicloProducao) {
        UnidadeCicloProducao = unidadeCicloProducao;
    }

    public boolean isSafraUnica() {
        return SafraUnica;
    }

    public void setSafraUnica(boolean safraUnica) {
        SafraUnica = safraUnica;
    }

    public int getQuantidadeSafra() {
        return QuantidadeSafra;
    }

    public void setQuantidadeSafra(int quantidadeSafra) {
        QuantidadeSafra = quantidadeSafra;
    }

    public int getIntervaloEntreSafra() {
        return IntervaloEntreSafra;
    }

    public void setIntervaloEntreSafra(int intervaloEntreSafra) {
        IntervaloEntreSafra = intervaloEntreSafra;
    }

    public UnidadeTempo getUnidadeEntreSafra() {
        return UnidadeEntreSafra;
    }

    public void setUnidadeEntreSafra(UnidadeTempo unidadeEntreSafra) {
        UnidadeEntreSafra = unidadeEntreSafra;
    }

    public int getIntervaloColheita() {
        return IntervaloColheita;
    }

    public void setIntervaloColheita(int intervaloColheita) {
        IntervaloColheita = intervaloColheita;
    }

    public UnidadeTempo getUnidadeIntervaloColheita() {
        return UnidadeIntervaloColheita;
    }

    public void setUnidadeIntervaloColheita(UnidadeTempo unidadeIntervaloColheita) {
        UnidadeIntervaloColheita = unidadeIntervaloColheita;
    }

    public String getEmbalagemVenda() {
        return EmbalagemVenda;
    }

    public void setEmbalagemVenda(String embalagemVenda) {
        EmbalagemVenda = embalagemVenda;
    }

    public int getPesoVenda() {
        return PesoVenda;
    }

    public void setPesoVenda(int pesoVenda) {
        PesoVenda = pesoVenda;
    }

    public UnidadePeso getUnidadePeso() {
        return UnidadePeso;
    }

    public void setUnidadePeso(UnidadePeso unidadePeso) {
        UnidadePeso = unidadePeso;
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
        Cultura other = (Cultura) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cultura [id=" + id + ", nome=" + nome + ", CicloVida=" + CicloVida + ", UnidadeCicloVida="
                + UnidadeCicloVida + ", InicioProducao=" + InicioProducao + ", UnidadeInicioProducao="
                + UnidadeInicioProducao + ", CicloProducao=" + CicloProducao + ", UnidadeCicloProducao="
                + UnidadeCicloProducao + ", SafraUnica=" + SafraUnica + ", QuantidadeSafra=" + QuantidadeSafra
                + ", IntervaloEntreSafra="
                + IntervaloEntreSafra + ", UnidadeEntreSafra=" + UnidadeEntreSafra + ", IntervaloColheita="
                + IntervaloColheita + ", UnidadeIntervaloColheita=" + UnidadeIntervaloColheita + ", EmbalagemVenda="
                + EmbalagemVenda + ", PesoVenda=" + PesoVenda + ", UnidadePeso=" + UnidadePeso + "]";
    }

    


    

}

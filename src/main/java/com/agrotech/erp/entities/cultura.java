package com.agrotech.erp.entities;

import com.agrotech.erp.entities.Enums.UnidadePeso;
import com.agrotech.erp.entities.Enums.UnidadeTempo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "cultura")
public class Cultura {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é uma informação obrigatória.")
    @Column(name = "Nome", unique = true)
    private String Nome;

    @Column(name = "CicloVida")
    private int CicloVida;

    @Column(name = "UnidadeCicloVida")
    private UnidadeTempo UnidadeCicloVida;

    @Column(name = "InicioProducao")
    private int InicioProducao;

    @Column(name = "UnidadeInicioProducao")
    private UnidadeTempo UnidadeInicioProducao;
    
    @Column(name = "CicloProducao")
    private int CicloProducao; 

    @Column(name = "UnidadeCicloProducao")
    private UnidadeTempo UnidadeCicloProducao;    

    @Column(name = "SafraUnica")    
    private boolean SafraUnica;

    @Column(name = "IntervaloEntreSafra")    
    private int IntervaloEntreSafra;

    @Column(name = "UnidadeEntreSafra")
    private UnidadeTempo UnidadeEntreSafra;    

    @Column(name = "IntervaloColheita")    
    private int IntervaloColheita;

    @Column(name = "UnidadeIntervaloColheita")
    private UnidadeTempo UnidadeIntervaloColheita;   

    @Column(name = "EmbalagemVenda")    
    private String EmbalagemVenda;    


    @Column(name = "PesoVenda")    
    private int PesoVenda;   

    @Column(name = "UnidadePeso")    
    private UnidadePeso UnidadePeso;

    public Cultura() {
    }

    public Cultura(@NotBlank(message = "Nome é uma informação obrigatória.") String nome, int cicloVida,
            UnidadeTempo unidadeCicloVida, int inicioProducao, UnidadeTempo unidadeInicioProducao, int cicloProducao,
            UnidadeTempo unidadeCicloProducao, boolean safraUnica, int intervaloEntreSafra,
            UnidadeTempo unidadeEntreSafra, int intervaloColheita, UnidadeTempo unidadeIntervaloColheita,
            String embalagemVenda, int pesoVenda, com.agrotech.erp.entities.Enums.UnidadePeso unidadePeso) {
        Nome = nome;
        CicloVida = cicloVida;
        UnidadeCicloVida = unidadeCicloVida;
        InicioProducao = inicioProducao;
        UnidadeInicioProducao = unidadeInicioProducao;
        CicloProducao = cicloProducao;
        UnidadeCicloProducao = unidadeCicloProducao;
        SafraUnica = safraUnica;
        IntervaloEntreSafra = intervaloEntreSafra;
        UnidadeEntreSafra = unidadeEntreSafra;
        IntervaloColheita = intervaloColheita;
        UnidadeIntervaloColheita = unidadeIntervaloColheita;
        EmbalagemVenda = embalagemVenda;
        PesoVenda = pesoVenda;
        UnidadePeso = unidadePeso;
    }



    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }


    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getCicloVida() {
        return CicloVida;
    }

    public void setCicloVida(int CicloVida) {
        this.CicloVida = CicloVida;
    }

    public UnidadeTempo getUnidadeCicloVida() {
        return UnidadeCicloVida;
    }

    public void setUnidadeCicloVida(UnidadeTempo UnidadeCicloVida) {
        this.UnidadeCicloVida = UnidadeCicloVida;
    }

    public int getInicioProducao() {
        return InicioProducao;
    }

    public void setInicioProducao(int InicioProducao) {
        this.InicioProducao = InicioProducao;
    }

    public UnidadeTempo getUnidadeInicioProducao() {
        return UnidadeInicioProducao;
    }

    public void setUnidadeInicioProducao(UnidadeTempo UnidadeInicioProducao) {
        this.UnidadeInicioProducao = UnidadeInicioProducao;
    }


    
    public boolean isSafraUnica() {
        return SafraUnica;
    }

    public void setSafraUnica(boolean SafraUnica) {
        this.SafraUnica = SafraUnica;
    }

    public int getIntervaloEntreSafra() {
        return IntervaloEntreSafra;
    }

    public void setIntervaloEntreSafra(int IntervaloEntreSafra) {
        this.IntervaloEntreSafra = IntervaloEntreSafra;
    }

    public UnidadeTempo getUnidadeEntreSafra() {
        return UnidadeEntreSafra;
    }

    public void setUnidadeEntreSafra(UnidadeTempo UnidadeEntreSafra) {
        this.UnidadeEntreSafra = UnidadeEntreSafra;
    }

    public int getIntervaloColheita() {
        return IntervaloColheita;
    }

    public void setIntervaloColheita(int IntervaloColheita) {
        this.IntervaloColheita = IntervaloColheita;
    }

    public UnidadeTempo getUnidadeIntervaloColheita() {
        return UnidadeIntervaloColheita;
    }

    public void setUnidadeIntervaloColheita(UnidadeTempo UnidadeIntervaloColheita) {
        this.UnidadeIntervaloColheita = UnidadeIntervaloColheita;
    }

    public String getEmbalagemVenda() {
        return EmbalagemVenda;
    }

    public void setEmbalagemVenda(String EmbalagemVenda) {
        this.EmbalagemVenda = EmbalagemVenda;
    }

    public int getPesoVenda() {
        return PesoVenda;
    }

    public void setPesoVenda(int PesoVenda) {
        this.PesoVenda = PesoVenda;
    }

    public UnidadePeso getUnidadePeso() {
        return UnidadePeso;
    }

    public void setUnidadePeso(UnidadePeso UnidadePeso) {
        this.UnidadePeso = UnidadePeso;
    }

    @Override
    public String toString() {
        return "Cultura [id=" + id + ", Nome=" + Nome + ", CicloVida=" + CicloVida + ", UnidadeCicloVida="
                + UnidadeCicloVida + ", InicioProducao=" + InicioProducao + ", UnidadeInicioProducao="
                + UnidadeInicioProducao + ", SafraUnica=" + SafraUnica + ", IntervaloEntreSafra=" + IntervaloEntreSafra
                + ", UnidadeEntreSafra=" + UnidadeEntreSafra + ", IntervaloColheita=" + IntervaloColheita
                + ", UnidadeIntervaloColheita=" + UnidadeIntervaloColheita + ", EmbalagemVenda=" + EmbalagemVenda
                + ", PesoVenda=" + PesoVenda + ", UnidadePeso=" + UnidadePeso + "]";
    }

    public void setId(Long id) {
        this.id = id;
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


  


    

}

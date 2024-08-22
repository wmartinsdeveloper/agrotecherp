package com.agrotech.erp.config;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.agrotech.erp.entities.CategoriaProduto;
import com.agrotech.erp.entities.Cultura;
import com.agrotech.erp.entities.Produto;
import com.agrotech.erp.entities.Enums.TipoCompra;
import com.agrotech.erp.entities.Enums.UnidadePeso;
import com.agrotech.erp.entities.Enums.UnidadeTempo;
import com.agrotech.erp.repositories.CategoriaProdutoRepository;
import com.agrotech.erp.repositories.CulturaRepository;
import com.agrotech.erp.repositories.ProdutoRepository;


@Configuration
public class DataInicializer  implements CommandLineRunner {

    @Autowired
    private CulturaRepository culturaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaProdutoRepository CategoriaProdutoRepository;



    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat format = new  SimpleDateFormat("dd/MM/yyyy HH:mm:ss") ;
        Date date = format.parse("22/08/2024 00:00:00");


        Optional<Cultura> cultura = culturaRepository.findByNome("Maxixe");        
        if(!cultura.isPresent() ) {
            Cultura aux_cultura = new Cultura("Maxixe", 75, UnidadeTempo.DIAS, 60, UnidadeTempo.DIAS, 15, UnidadeTempo.DIAS, true, 1, 0, UnidadeTempo.NA, 3, UnidadeTempo.DIAS, "Tela de 15KG", 15, UnidadePeso.KILOS);
            culturaRepository.save(aux_cultura);

        }

        Optional<CategoriaProduto> categoriaProduto = CategoriaProdutoRepository.findByNome("Inseticida");
        if (!categoriaProduto.isPresent() ) {
            
            CategoriaProduto aux_categoriaProduto = new CategoriaProduto("Inseticida", "Controle de insetos");
            CategoriaProdutoRepository.save(aux_categoriaProduto);

        }

        Optional<Produto> produto = produtoRepository.findByNome("Recop");
        
        if (!produto.isPresent() ) {
            
                Optional<CategoriaProduto> categoriaProduto1 = CategoriaProdutoRepository.findByNome("Inseticida");

                Produto aux_produto = new Produto(date, "Recop", " ", 2, UnidadePeso.KILOS, 1, 10.00, 1, 0, 10.00, TipoCompra.INVESTIDO,Set.of(categoriaProduto1.get()));
                produtoRepository.save(aux_produto);
    
            }



    }





}

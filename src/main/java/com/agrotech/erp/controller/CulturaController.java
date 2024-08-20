package com.agrotech.erp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agrotech.erp.dto.dtoCultura;
import com.agrotech.erp.entities.Cultura;
import com.agrotech.erp.service.CulturaService;




@RestController
@RequestMapping("/cultura")
public class CulturaController {

    @Autowired
    private CulturaService culturaService;


    @GetMapping("/buscar")
    public ResponseEntity<?> BuscaPorNome(@RequestParam("nome") String nome) {
        
        Optional<Cultura> cultura = culturaService.findByNome(nome);
        return cultura.isPresent() ? ResponseEntity.ok(cultura) : ResponseEntity.notFound().build();

    }
    

    @PostMapping("/salvar")
    public ResponseEntity Salvar(@RequestBody dtoCultura cultura) {
         
    try{    
            if(cultura != null){
                culturaService.save(cultura);
                return ResponseEntity.ok(cultura);
            }else
            { 
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Json body is empity, fill up the content of json and try again !");
            }
    }catch(Exception e) 
    {
        return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("<h1>Error to save the information! </h1></br>" + e.getMessage());
    }




    }
    



}

package com.agrotech.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agrotech.erp.dto.dtoCultura;
import com.agrotech.erp.service.CulturaService;




@RestController
@RequestMapping("/cultura")
public class CulturaController {

    @Autowired
    private CulturaService culturaService;


    @GetMapping("/buscar")
    public ResponseEntity<?> BuscaPorNome(@RequestParam("nome") String nome) {
        
        try{            
            if(nome!= null){
                return ResponseEntity.ok(culturaService.findByNome(nome));
            } else
            return ResponseEntity.notFound().build();
        }catch(Exception e) 
        {
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("<h1>Error to find the information! </h1></br>" + e.getMessage());
        }          

    }
    

    @GetMapping("/listar")
    public ResponseEntity<?> BuscaPorNome() {
        return ResponseEntity.ok(culturaService.listar());
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
    


    @DeleteMapping("/deletar")
    public ResponseEntity deletar(@RequestParam("nome") String nome) {
         
        try{                    
                if(nome != null){
                    culturaService.delete(nome);
                    return  ResponseEntity.status(HttpStatus.OK).body("<h1>Register was deleted! </h1></br>");
                } else
                return ResponseEntity.notFound().build();
        }catch(Exception e) 
        {
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("<h1>Error to delete the information! </h1></br>" + e.getMessage());
        }

    }



}

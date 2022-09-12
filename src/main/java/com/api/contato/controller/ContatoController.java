package com.api.contato.controller;

import com.api.contato.model.Contato;
import com.api.contato.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatos")
public class ContatoController {
    @Autowired
    ContatoRepository repository;

    @GetMapping
    public List<Contato> listarContatos(){
        return repository.findAll();
    }

    @PostMapping
    public void salvarContato(@RequestBody Contato contato){
        repository.save(contato);
    }

    @PutMapping
    public void alterarContato(@RequestBody Contato contato){
        if (contato.getId() > 0 ){
            repository.save(contato);
        }
    }

    @DeleteMapping
    public void excluirContato(@RequestBody Contato contato){
        repository.delete(contato);
    }
}



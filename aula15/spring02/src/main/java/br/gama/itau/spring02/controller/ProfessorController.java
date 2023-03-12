
package br.gama.itau.spring02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.gama.itau.spring02.model.Professor;
import br.gama.itau.spring02.repository.ProfessorRepo;

@RestController //indica que esta classe é um controller do tipo REST
@RequestMapping("/professor") // mapeamento deta classe
public class ProfessorController {

    // gera a implementacao da clase e um objeto
    @Autowired
    private ProfessorRepo repo;

    @GetMapping("/{codigo}")
    public Professor getProfessor(@PathVariable long codigo) {
        return repo.findById(codigo).get();
        
    }

    
}

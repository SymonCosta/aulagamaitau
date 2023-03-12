package br.gama.itau.spring02.repository;

import org.springframework.data.repository.CrudRepository;

import br.gama.itau.spring02.model.Professor;

// CRUD = CREATE, READ, UPDATE, DELETE
// <Professor, Long> = Professor é a Entidade e Long é o tipo da chave primaria
public interface ProfessorRepo extends CrudRepository<Professor, Long> {
        
}


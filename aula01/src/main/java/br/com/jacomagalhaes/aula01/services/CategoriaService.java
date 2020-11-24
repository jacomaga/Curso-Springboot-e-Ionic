package br.com.jacomagalhaes.aula01.services;

import br.com.jacomagalhaes.aula01.domain.Categoria;
import br.com.jacomagalhaes.aula01.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Optional<Categoria> search(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj;
    }
}

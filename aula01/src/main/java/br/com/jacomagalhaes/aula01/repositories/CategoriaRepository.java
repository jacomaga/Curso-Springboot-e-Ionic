package br.com.jacomagalhaes.aula01.repositories;

import br.com.jacomagalhaes.aula01.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {


}

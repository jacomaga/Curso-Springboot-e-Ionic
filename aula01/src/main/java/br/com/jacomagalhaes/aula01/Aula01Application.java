package br.com.jacomagalhaes.aula01;

import br.com.jacomagalhaes.aula01.domain.Categoria;
import br.com.jacomagalhaes.aula01.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class Aula01Application implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public static void main(String[] args) {
        SpringApplication.run(Aula01Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null, "Informática");
        Categoria cat2 = new Categoria(null, "Financeiro");
        Categoria cat3 = new Categoria(null, "Escritório");

        categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));

    }
}

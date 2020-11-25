package br.com.jacomagalhaes.aula01;

import br.com.jacomagalhaes.aula01.domain.Categoria;
import br.com.jacomagalhaes.aula01.domain.Cidade;
import br.com.jacomagalhaes.aula01.domain.Estado;
import br.com.jacomagalhaes.aula01.domain.Produto;
import br.com.jacomagalhaes.aula01.repositories.CategoriaRepository;
import br.com.jacomagalhaes.aula01.repositories.CidadeRepository;
import br.com.jacomagalhaes.aula01.repositories.EstadoRepository;
import br.com.jacomagalhaes.aula01.repositories.ProdutoRepository;
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
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private EstadoRepository estadoRepository;
    @Autowired
    private CidadeRepository cidadeRepository;

    public static void main(String[] args) {
        SpringApplication.run(Aula01Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null, "Informática");
        Categoria cat2 = new Categoria(null, "Financeiro");
        Categoria cat3 = new Categoria(null, "Escritório");

        Produto p1 = new Produto(null, "Computador", 2000.00);
        Produto p2 = new Produto(null, "Triturador de papel", 568.00);
        Produto p3 = new Produto(null, "Mouse", 30.00);
        Produto p4 = new Produto(null, "Impressora", 2000.00);

        cat1.getProdutos().addAll(Arrays.asList(p1,p3,p4));
        cat2.getProdutos().addAll(Arrays.asList(p2,p3));
        cat3.getProdutos().addAll(Arrays.asList(p2,p3));

        p1.getCategorias().addAll(Arrays.asList(cat1));
        p2.getCategorias().addAll(Arrays.asList(cat2,cat3));
        p3.getCategorias().addAll(Arrays.asList(cat1,cat2,cat3));
        p4.getCategorias().addAll(Arrays.asList(cat1));

        categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
        produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4));

        Estado est1 = new Estado(null, "Minas Gerais");
        Estado est2 = new Estado(null, "São Paulo");

        Cidade c1 = new Cidade(null, "Uberlândia", est1);
        Cidade c2 = new Cidade(null, "São Paulo", est2);
        Cidade c3 = new Cidade(null, "Campinas", est2);

        est1.getCidades().addAll(Arrays.asList(c1));
        est2.getCidades().addAll(Arrays.asList(c2, c3));

        estadoRepository.saveAll(Arrays.asList(est1, est2));
        cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));

    }
}

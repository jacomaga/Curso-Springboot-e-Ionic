package br.com.jacomagalhaes.aula01.repositories;

import br.com.jacomagalhaes.aula01.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
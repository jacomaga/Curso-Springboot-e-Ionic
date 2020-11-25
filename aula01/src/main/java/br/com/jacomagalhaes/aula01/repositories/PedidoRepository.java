package br.com.jacomagalhaes.aula01.repositories;

import br.com.jacomagalhaes.aula01.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
package br.com.jacomagalhaes.aula01.services;

import br.com.jacomagalhaes.aula01.domain.Pedido;
import br.com.jacomagalhaes.aula01.exceptions.ObjectNotFoundException;
import br.com.jacomagalhaes.aula01.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }

}

package br.com.jacomagalhaes.aula01.services;

import br.com.jacomagalhaes.aula01.domain.Cliente;
import br.com.jacomagalhaes.aula01.exceptions.ObjectNotFoundException;
import br.com.jacomagalhaes.aula01.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }

}

package br.com.fiap.revisao.dao;

import br.com.fiap.revisao.bean.Carro;

import java.util.*;

public interface CarroDao {

    void cadastrar(Carro carro);
    List<Carro> listar();
}

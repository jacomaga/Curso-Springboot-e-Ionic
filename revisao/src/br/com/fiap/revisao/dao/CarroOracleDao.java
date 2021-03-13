package br.com.fiap.revisao.dao;

import br.com.fiap.revisao.bean.Carro;

import java.util.List;
import java.util.ArrayList;

public class CarroOracleDao implements CarroDao{

    public void cadastrar(Carro carro){
        System.out.println("Cadastrado");
    }

    public List<Carro> listar(){
        List<Carro> list = new ArrayList<>();
        return list;
    }
}

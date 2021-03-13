package br.com.fiap.revisao;
import br.com.fiap.revisao.bean.Carro;
import br.com.fiap.revisao.bean.Veiculo;

import java.util.*;
import java.util.ArrayList;


public class TesteColecao {

    public static void main(String[] args) {

        List<Carro> lista = new ArrayList<Carro>();

        lista.add(new Carro(2020, "uno"));
        lista.add(new Carro(2010, "Civic"));

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).getAno()+ " " + lista.get(i).getModelo());
        }

        for(Carro c : lista){
            System.out.println(c.getAno() + " " + c.getModelo());
        }

        lista.forEach(c -> System.out.println(c.getAno() + " " + c.getModelo()));

        Map<String, Carro> mapa =  new HashMap<String,Carro>();

        mapa.put("Fiat",new Carro(2020,"Uno"));

       System.out.println(mapa.get("Fiat").getAno());

    }
}

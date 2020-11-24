package aplicativo;


import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
		EntityManager em = emf.createEntityManager();

		try{
			Pessoa p = em.find(Pessoa.class,2);
			System.out.println(p.getNome());

			em.close();
			emf.close();
		}catch(Exception e){
			System.out.println("Ok");
		}


	}
	
}

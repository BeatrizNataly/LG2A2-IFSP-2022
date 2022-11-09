package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Veiculo;

public class AppErrado {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
		EntityManager em = emf.createEntityManager();

		List<Veiculo> listaVeiculos = em.createQuery("FROM Veiculo", Veiculo.class).getResultList();
	
		for(Veiculo v: listaVeiculos)
			System.out.println("VEÍCULO [" + v.getId() + "] ->\n"
					+ v.getModelo() + "\n Id do proprietário[" + v.getProprietario().getId() + "]\n\n");
	}
}

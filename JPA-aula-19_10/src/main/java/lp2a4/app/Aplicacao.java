package lp2a4.app;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import lp2a4.modelo.Estudante;

public class Aplicacao {

	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		estudante.setNome("Beatriz Silva");
		estudante.setMatricula("SP0987654");
		estudante.setEndereco("Rua Pedro Vicente 625 - Canindé, São Paulo - SP");
		estudante.setEmail("beatrizs@email.com");
		estudante.setDataIngresso(LocalDate.of(2021, 4, 16));

		// Mesmo nome da unidade de persistencia definida no persistence.xml

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		
		//É necessário nesse caso fazer o transaction e commitar pois definimos no persistence o auto commit como falso;
		//Ou seja, ele só irá salvar no BD se definirmos isso manualmente.
		em.getTransaction().begin();
		em.persist(estudante);
		em.getTransaction().commit();
		
		//consultar BD
		Estudante estudanteEncontrado =  em.find(Estudante.class, "SP0987654");
		System.out.println(estudanteEncontrado);
		
		estudanteEncontrado.setEmail("beatriz2s@email.com");
		
		em.getTransaction().begin();
		em.persist(estudanteEncontrado);
		em.getTransaction().commit();
		
		Estudante estudanteEncontradodeNovo =  em.find(Estudante.class, "SP0987654");
		System.out.println(estudanteEncontradodeNovo);
		
		em.getTransaction().begin();
		em.remove(em.find(Estudante.class, "SP0987654")); //poderiamos usar uma var merged
		// ex: aluno2 = em.merge(estudante) --> em.remove(aluno2);
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}
}

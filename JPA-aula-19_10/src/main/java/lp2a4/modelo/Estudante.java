package lp2a4.modelo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Estudante
 *
 */
@Entity
@Table(name="estudante")
public class Estudante implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String matricula;
	@Column(nullable=false)
	private String nome;
	@Column
	private String endereco;
	@Column
	private String email;
	@Column(name="data_ingresso", nullable=false)
	private LocalDate dataIngresso;

	public Estudante() {
		super();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(LocalDate dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	@Override
	public String toString() {
		return "Estudante [matricula=" + matricula + ", nome=" + nome + ", endereco=" + endereco + ", email=" + email
				+ ", dataIngresso=" + dataIngresso + "]";
	}
   
	
}

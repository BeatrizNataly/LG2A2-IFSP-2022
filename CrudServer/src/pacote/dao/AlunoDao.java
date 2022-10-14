package pacote.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import pacote.Aluno;

public class AlunoDao {
	public static Connection getConnection() {
		java.sql.Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudaluno", "root", "");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return (Connection) conn;
	}
	
	public static List<Aluno> getAllAlunos(){
		List<Aluno> listaDeAlunos = new ArrayList<>();
		try {
			Connection conn = getConnection();
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("SELECT * FROM tbAluno");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Aluno aluno = new Aluno(rs.getString("nome"), rs.getString("matricula"));
				aluno.setId(rs.getInt("id"));
				listaDeAlunos.add(aluno);
			}
		
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return listaDeAlunos;
	}
	
	public static Aluno getAlunoById(int id) {
		Aluno aluno = null;
		
		try {
			Connection conn = getConnection();
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("SELECT * FROM tbAluno WHERE id=?");
			ps.setInt(1, id); //Seta o 1° parâmetro (?) com a variável que está sendo passada.
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				aluno = new Aluno(rs.getString("nome"), rs.getString("matricula"));
				aluno.setId(rs.getInt("id"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return aluno;
	}
	
	public static int updateAluno(Aluno a) {
		int status = 0;
		try {
			Connection conn = getConnection();
			PreparedStatement ps = (PreparedStatement) 
					conn.prepareStatement("UPDATE tbAluno SET nome=?, matricula=? WHERE id=?");
		ps.setString(1, a.getNome());
		ps.setString(2, a.getMatricula());
		ps.setInt(3, a.getId());
		
		status = ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return status;
	}
	
	public static int insertAluno(Aluno a) {
		int status = 0;
		try {
			Connection conn = getConnection();
			PreparedStatement ps = (PreparedStatement)
					conn.prepareStatement("INSERT INTO tbAluno (nome, matricula) VALUES (?,?)");
			ps.setString(1, a.getNome());
			ps.setString(2, a.getMatricula());
			status = ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return status;
	}
	
	public static int deletarAluno(Aluno a) {
		int status = 0;
		try {
			Connection conn = getConnection();
			PreparedStatement ps = (PreparedStatement)
					conn.prepareStatement("DELETE FROM tbAluno WHERE id=?");
			ps.setInt(1, a.getId());
			status = ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return status;
	}
}

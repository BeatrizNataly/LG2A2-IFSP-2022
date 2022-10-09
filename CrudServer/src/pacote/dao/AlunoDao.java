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
}

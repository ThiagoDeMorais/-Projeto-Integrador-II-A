package repositorioPergunta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conn.Conexao;
import dominio.Pergunta;

public class RepositorioPergunta {
	public static void salvar(Pergunta pergunta) {
		try(Connection conn = Conexao.getConnection();
			PreparedStatement ps = PreparedStatementSalvar(conn, pergunta)) {
				
				int rowsAffected = ps.executeUpdate();		
				System.out.printf("Pergunta %s salva, linhas afetadas %d", pergunta.getId(), rowsAffected);
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
	}
	
	private static PreparedStatement PreparedStatementSalvar(Connection conn, Pergunta pergunta) throws SQLException {
		String sql = "INSERT INTO `questionario`.`pergunta` (`enunciado`) VALUES ( ? );";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, pergunta.getEnunciado());
		return ps;
	}
}

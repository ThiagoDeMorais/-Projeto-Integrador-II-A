package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/questionario";
		String usarname = "root";
		String password = "3592";
			return DriverManager.getConnection(url, usarname, password);
	}
}

package br.com.tcb.tanahoraWS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaMySql {

	private static final String URL ="jdbc:mysql://localhost/tanahoraws";
	private static final String USER ="root";
	private static final String SENHA ="12345";
	
	public static Connection obtemConexao() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
		return DriverManager.getConnection(URL,USER,SENHA);
	}		
	
}

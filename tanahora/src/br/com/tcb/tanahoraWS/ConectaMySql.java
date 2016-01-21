package br.com.tcb.tanahoraWS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaMySql {

	private static final String URL ="jdbc:mysql://127.11.46.2:3306/tanahoraws";
	private static final String USER ="adminaV5fPkj";
	private static final String SENHA ="cGp-y9K6MhAY";
	
	public static Connection obtemConexao() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
		return DriverManager.getConnection(URL,USER,SENHA);
	}		
	
}

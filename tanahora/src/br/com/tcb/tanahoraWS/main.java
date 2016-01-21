package br.com.tcb.tanahoraWS;

import java.sql.Connection;
import java.sql.SQLException;

public class main {

	
	public main() throws SQLException {
		
		Connection conn = ConectaMySql.obtemConexao();
		
	
	}
}

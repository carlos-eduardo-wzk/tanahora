package br.com.tcb.tanahoraWS;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class MarcacaoDAO {

	public boolean inserirMarcacao(Marcacao marcacao) {
		try {
			Connection conn = ConectaMySql.obtemConexao();
			String queryInserir = "INSERT INTO marcacoes values (null,?,?,?,?,?,?,?)";
			PreparedStatement ppStm = conn.prepareStatement(queryInserir);
			ppStm.setDouble(1, marcacao.getLatitude());
			ppStm.setDouble(2, marcacao.getLongitude());
			ppStm.setInt(3, marcacao.getPin());
			ppStm.setString(4, marcacao.getPis());
			ppStm.setString(5, marcacao.getEmpresa_pin());
			ppStm.setDate(6, (Date) marcacao.getData());
			ppStm.setInt(7, marcacao.getHora());
			ppStm.executeUpdate();

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public ArrayList<Marcacao> buscarTodosUsuarios() {

		ArrayList<Marcacao> lista = new ArrayList<Marcacao>();

		try {
			Connection conn = ConectaMySql.obtemConexao();
			String queryInserir = "SELECT * FROM marcacoes ";
			PreparedStatement ppStm = conn.prepareStatement(queryInserir);

			ResultSet rset = ppStm.executeQuery();

			while (rset.next()) {
				Marcacao marc = new Marcacao();

				marc.setId(rset.getInt(1));
				marc.setLatitude(rset.getDouble(2));
				marc.setLongitude(rset.getDouble(3));
				marc.setPin(rset.getInt(4));
				marc.setPis(rset.getString(5));
				marc.setEmpresa_pin(rset.getString(6));
				marc.setData(rset.getDate(7));
				marc.setHora(rset.getInt(8));
				lista.add(marc);
			}

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}

	public boolean excluirMarcacao(Marcacao marcacao) {

		try {
			Connection conn = ConectaMySql.obtemConexao();
			String queryInserir = "DELETE FROM marcacoes where id = ?";
			PreparedStatement ppStm = conn.prepareStatement(queryInserir);
			ppStm.setInt(1, marcacao.getId());
			ppStm.executeUpdate();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	
	public boolean excluirMarcacao(int id){
		return excluirMarcacao(new Marcacao(id,0.0,0.0,0,"","",null,0));
		
		
	}
}
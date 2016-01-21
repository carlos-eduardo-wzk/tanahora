package br.com.tcb.tanahoraWS;

import java.util.Date;

public class Marcacao {

  private int Id;
  private Double latitude;
  private Double longitude;
  private int pin;
  private String pis;
  private String empresa_pin;
  private Date data;
  private int hora;

  

public Marcacao() {
}





public Marcacao(int id, Double latitude, Double longitude, int pin, String pis,
		String empresa_pin, Date data, int hora) {
	Id = id;
	this.latitude = latitude;
	this.longitude = longitude;
	this.pin = pin;
	this.pis = pis;
	this.empresa_pin = empresa_pin;
	this.data = data;
	this.hora = hora;
}





public int getId() {
	return Id;
}


public void setId(int id) {
	Id = id;
}


public Double getLatitude() {
	return latitude;
}


public void setLatitude(Double latitude) {
	this.latitude = latitude;
}


public Double getLongitude() {
	return longitude;
}


public void setLongitude(Double longitude) {
	this.longitude = longitude;
}


public int getPin() {
	return pin;
}


public void setPin(int pin) {
	this.pin = pin;
}


public String getPis() {
	return pis;
}


public void setPis(String pis) {
	this.pis = pis;
}


public String getEmpresa_pin() {
	return empresa_pin;
}


public void setEmpresa_pin(String empresa_pin) {
	this.empresa_pin = empresa_pin;
}


public Date getData() {
	return data;
}


public void setData(Date data) {
	this.data = data;
}


public int getHora() {
	return hora;
}


public void setHora(int hora) {
	this.hora = hora;
}
  
  
   
  
	
	
}

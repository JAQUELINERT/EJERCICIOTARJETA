package mx.edu.utng.ejercicioTarjetas;

import java.util.List;


public class Tarjeta {
	private String tipos;
	private String dedicatoria;
	private int numDestinatario;
	private Remitente remitentes;
	private List<Destinatario> destinatarios;
	
	public void adicionarRemitente(Remitente remitente){
		this.remitentes = remitente;
	}
	
	public void adicionarDestinatario(List<Destinatario> destinatarios){
		this.destinatarios = destinatarios;
		
	}
	
	public Tarjeta(List<Destinatario> destinatarios){
		this.destinatarios = destinatarios;
	}
	
	public String getTipo() {
		return tipos;
	}
	public String getDedicatoria() {
		return dedicatoria;
	}
	public int getNumDestinatario() {
		return numDestinatario;
	}
	public void setTipo(String tipo) {
		this.tipos = tipo;
	}
	public void setDedicatoria(String dedicatoria) {
		this.dedicatoria = dedicatoria;
	}
	public void setNumDestinatario(int numDestinatario) {
		this.numDestinatario = numDestinatario;
	}
	
	
}

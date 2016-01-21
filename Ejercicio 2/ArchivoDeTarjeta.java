package mx.edu.utng.ejercicioTarjetas;

import java.util.List;


public class ArchivoDeTarjeta extends Tarjeta {
	private String nombre;
	private List<TarjetaAnimada> tarjetasAnimadas;
	private int codigo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void adicionar(TarjetaAnimada tarjeta){
		this.tarjetasAnimadas.add(tarjeta);
		
	}
	
	public void modificar(TarjetaAnimada tarjeta){
		this.tarjetasAnimadas.indexOf(tarjeta);
		
	}
	public void eliminar(int codigo){
				this.tarjetasAnimadas.remove(codigo);
	}
	
	public List<TarjetaAnimada> getDatos(){
		return tarjetasAnimadas;
			
	}
	
	public int numRegistros(){
		return tarjetasAnimadas.size();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	

}

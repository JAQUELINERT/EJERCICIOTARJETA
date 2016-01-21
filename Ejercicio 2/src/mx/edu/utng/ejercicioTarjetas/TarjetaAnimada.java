package mx.edu.utng.ejercicioTarjetas;
import java.util.List;


public class TarjetaAnimada {
	private int codigo;
	private Fondo fondo;
	private Dedicatoria dedicatoria;
	private Imagen imagen;
	
	
	public TarjetaAnimada(Fondo fondo, Imagen imagen, List<Destinatario> destinatarios){
		super(destinatario);
		this.fondo = fondo;
		this.imagen = imagen;
		this.dedicatoria = new Dedicatoria();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	 
	 

}

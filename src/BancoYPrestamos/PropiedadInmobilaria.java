package BancoYPrestamos;

public class PropiedadInmobilaria {
	
	private String descripcion;
	private String direccion;
	private float valorFiscal;
	public PropiedadInmobilaria(String descripcion, String direccion, float valorFiscal) {
		super();
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getDireccion() {
		return direccion;
	}
	public float getValorFiscal() {
		return valorFiscal;
	}
	
	

}

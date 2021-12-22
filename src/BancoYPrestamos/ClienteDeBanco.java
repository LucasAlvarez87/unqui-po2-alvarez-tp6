package BancoYPrestamos;

public class ClienteDeBanco {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private float sueldoNetoMensual;
	
	
	
	public ClienteDeBanco(String nombre, String apellido, String direccion, int edad, float sueldoNetoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public float getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getEdad() {
		return edad;
	}
	
	public float getSueldoNetoAnual() {
		return this.getSueldoNetoMensual() * 12;
	}

	public void solicitarPrestamoPersonal(Banco banco, double monto, int cuotas) {
		banco.agregarSolicitudDeCreditoPersonal(this, monto, cuotas);
	}
	
	public void solicitarPrestamoHipoteacrio(Banco banco, PropiedadInmobilaria garantia, double monto, int cuotas) {
		banco.agregarSolicitudHipotecario(this, garantia, monto, cuotas);
	}
	
	
	
}

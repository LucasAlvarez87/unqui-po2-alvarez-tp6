package BancoYPrestamos;

public abstract class ClienteDeBanco {
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

	public void solicitarPrestamoPersonal(Banco banco) {
		banco.agregarSolicitudDeCreditoPersonal(this);
	}
	
	public void solicitarPrestamoHipoteacrio(Banco banco, PropiedadInmobilaria garantia) {
		banco.agregarSolicitudHipotecario(this, garantia);
	}
	
	
	
}

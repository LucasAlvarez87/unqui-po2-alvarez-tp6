package BancoYPrestamos;

public abstract class Solicitud {
	private ClienteDeBanco cliente;
	private float montoSolicitado;
	private int plazoEnMeses;
	
	
	public Solicitud(ClienteDeBanco cliente) {
		super();
		this.cliente = cliente;
	}
	public ClienteDeBanco getCliente() {
		return cliente;
	}
	public float getMontoSolicitado() {
		return montoSolicitado;
	}
	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}
	
	public abstract boolean esAceptable();

	public float getCosteDeCuota() {
		return this.getMontoSolicitado() / this.getPlazoEnMeses();
	}
	
}

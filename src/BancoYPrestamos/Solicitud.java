package BancoYPrestamos;

public abstract class Solicitud {
	private ClienteDeBanco cliente;
	private double montoSolicitado;
	private double plazoEnMeses;
	
	
	public Solicitud(ClienteDeBanco cliente, double monto, int cuotas) {
		super();
		this.cliente = cliente;
		this.montoSolicitado = monto;
		this.plazoEnMeses = cuotas;
	}
	public ClienteDeBanco getCliente() {
		return cliente;
	}
	public double getMontoSolicitado() {
		return montoSolicitado;
	}
	public double getPlazoEnMeses() {
		return plazoEnMeses;
	}
	
	public abstract boolean esAceptable();

	public double getCosteDeCuota() {
		return this.getMontoSolicitado() / this.getPlazoEnMeses();
	}
	
}

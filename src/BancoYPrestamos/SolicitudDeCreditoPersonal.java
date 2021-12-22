package BancoYPrestamos;

public class SolicitudDeCreditoPersonal extends Solicitud {

	public SolicitudDeCreditoPersonal(ClienteDeBanco cliente, double monto, int cuotas) {
		super(cliente, monto, cuotas);
	}

	@Override
	public boolean esAceptable() {
		return this.getCliente().getSueldoNetoAnual() > 15000 
				&& this.getCliente().getSueldoNetoMensual()*0.7 > this.getCosteDeCuota();
	}

	
}

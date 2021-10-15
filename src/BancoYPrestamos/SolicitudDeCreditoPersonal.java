package BancoYPrestamos;

public class SolicitudDeCreditoPersonal extends Solicitud {

	public SolicitudDeCreditoPersonal(ClienteDeBanco cliente) {
		super(cliente);
	}

	@Override
	public boolean esAceptable() {
		return this.getCliente().getSueldoNetoAnual() > 15000 
				&& this.getCliente().getSueldoNetoMensual()*0.7 > this.getCosteDeCuota();
	}

	
}

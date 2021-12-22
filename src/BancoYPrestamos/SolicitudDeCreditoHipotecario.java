package BancoYPrestamos;

public class SolicitudDeCreditoHipotecario extends Solicitud {
	
	public SolicitudDeCreditoHipotecario(ClienteDeBanco cliente, PropiedadInmobilaria garantia, double monto, int cuotas) {
		super(cliente, monto, cuotas);
		this.garantia = garantia;
	}

	private PropiedadInmobilaria garantia;
	
	

	public PropiedadInmobilaria getGarantia() {
		return garantia;
	}



	@Override
	public boolean esAceptable() {
		return this.getCliente().getSueldoNetoMensual() > this.getCosteDeCuota() &&
				this.getMontoSolicitado() < this.getGarantia().getValorFiscal() * 0.7 &&
				this.getCliente().getEdad() < 65;
	}

}

package BancoYPrestamos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Banco {
	private List <ClienteDeBanco> clientes = new ArrayList <ClienteDeBanco>();
	private List <Solicitud> soliciutdes = new ArrayList <Solicitud>();
	
	public List<ClienteDeBanco> getClientes() {
		return clientes;
	}
	public List<Solicitud> getSoliciutdes() {
		return soliciutdes;
	}
	public Banco() {
		super();
	}
	
	public void agregarSolicitudDeCreditoPersonal(ClienteDeBanco cliente, double monto, int cuotas) {
		this.getSoliciutdes().add(new SolicitudDeCreditoPersonal(cliente, monto, cuotas) );
	}
	
	public void agregarSolicitudHipotecario(ClienteDeBanco cliente, PropiedadInmobilaria garantia, double monto, int cuotas) {
		this.getSoliciutdes().add(new SolicitudDeCreditoHipotecario(cliente, garantia, monto, cuotas));
	}
	
	public double montoTotalADesembolsar() {
		Stream<Solicitud> aceptables = this.getSoliciutdes().stream().filter(a -> a.esAceptable()) ;
		return aceptables.mapToDouble(p->p.getMontoSolicitado()).reduce(0,(acumulado,nuevo)-> acumulado + nuevo);
	}
}

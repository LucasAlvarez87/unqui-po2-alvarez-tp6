package BancoYPrestamos;

import java.util.ArrayList;
import java.util.List;

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
	
	public void agregarSolicitudDeCreditoPersonal(ClienteDeBanco cliente) {
		this.getSoliciutdes().add(new SolicitudDeCreditoPersonal(cliente) );
	}
	
	public void agregarSolicitudHipotecario(ClienteDeBanco cliente, PropiedadInmobilaria garantia) {
		this.getSoliciutdes().add(new SolicitudDeCreditoHipotecario(cliente, garantia));
	}
	
}

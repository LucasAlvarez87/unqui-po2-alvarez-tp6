package BancoYPrestamos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoTest {
	
	private Banco banco;
	private ClienteDeBanco cliente1;
	private ClienteDeBanco cliente2;
	private ClienteDeBanco cliente3;
	private PropiedadInmobilaria garantia; 
	private SolicitudDeCreditoPersonal creditoPersonal;
	private SolicitudDeCreditoHipotecario creditoHipotecario;
	
	
	@BeforeEach	
	public void setUp() {
		 banco = new Banco();
		 cliente1 = new ClienteDeBanco("Marcos", "Perez", "Bragado 1947", 45, 45000);
		 cliente2 = new ClienteDeBanco("Diego", "Rodriguez", "Chascomus 1312", 30, 47800);
		 cliente3 = new ClienteDeBanco("Juan", "Navarro", "Lujan 1700", 80, 35000);
		 garantia = new PropiedadInmobilaria("Casa", "Chascomus 1312", 500000);
		 creditoPersonal = new SolicitudDeCreditoPersonal(cliente1, 80000, 6);
		 creditoHipotecario = new SolicitudDeCreditoHipotecario(cliente1, garantia, 70000, 12);
	}
	
	@Test
	public void esAceptable() {
		assertTrue(creditoPersonal.esAceptable());
	}
	
	
	@Test 
	public void clienteSolicitaPrestamoPersonal(){
		cliente1.solicitarPrestamoPersonal(banco, 30000, 6);
		assertFalse(banco.getSoliciutdes().isEmpty());
	}
	
	@Test
	public void clienteSolicitaPrestamoHipotecario() {
		cliente2.solicitarPrestamoHipoteacrio(banco, garantia, 30000, 12);
		assertFalse(banco.getSoliciutdes().isEmpty());
	}
	
	@Test
	public void clientesSolicitanPrestamos() {
		cliente1.solicitarPrestamoPersonal(banco, 30000,6);
		cliente2.solicitarPrestamoHipoteacrio(banco, garantia, 50000,3);
		assertEquals(banco.getSoliciutdes().size(), 2);
	}
	
	@Test
	public void clienteSolicitaPrestamoNoAceptado() {
		cliente3.solicitarPrestamoHipoteacrio(banco, garantia, 70000,12);
		assertEquals( banco.montoTotalADesembolsar(), 0d, 0);
	}
	
	@Test
	public void montoTotalDeSolicitudes() {
		cliente1.solicitarPrestamoPersonal(banco, 30000,3);
		cliente2.solicitarPrestamoHipoteacrio(banco, garantia, 50000,6);
		cliente3.solicitarPrestamoHipoteacrio(banco, garantia, 70000,12);
		assertEquals(banco.montoTotalADesembolsar(), 80000d, 0);
	}
	
	/*
	public static void main(String[] args) {
		 Banco banco;
		 ClienteDeBanco cliente1;
		 ClienteDeBanco cliente2;
		 ClienteDeBanco cliente3;
		 PropiedadInmobilaria garantia; 
		 
		 banco = new Banco();
		 cliente1 = new ClienteDeBanco("Marcos", "Perez", "Bragado 1947", 45, 45000);
		 cliente2 = new ClienteDeBanco("Diego", "Rodriguez", "Chascomus 1312", 30, 47800);
		 cliente3 = new ClienteDeBanco("Juan", "Navarro", "Lujan 1700", 80, 35000);
		 garantia = new PropiedadInmobilaria("Casa", "Chascomus 1312", 500000);
		
		cliente1.solicitarPrestamoPersonal(banco, 30000);
		cliente2.solicitarPrestamoHipoteacrio(banco, garantia, 50000);
		cliente3.solicitarPrestamoHipoteacrio(banco, garantia, 70000);
		
		System.out.print(banco.montoTotalADesembolsar());
	}
	*/
}

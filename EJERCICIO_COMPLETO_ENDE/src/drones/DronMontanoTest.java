package drones;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DronMontanoTest {
	public static DronMontano dron;

	private int distancia;
	private int altitud;
	private int resultadoEsperado;
	
	public DronMontanoTest(int distancia, int altitud, int resultadoEsperado) {
		this.distancia = distancia;
		this.altitud = altitud;
		this.resultadoEsperado = resultadoEsperado;
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dron = new DronMontano("DMO1", 120, 10, false, 1);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dron = null;
	}

	@Before
	public void setUp() throws Exception {
		dron.setOperative(true);
	}

	@After
	public void tearDown() throws Exception {
		dron.setOperative(false);
	}

    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][] {
            { 10, 1.5, 1  },
            { 7,  1.05, 0  },
            { 5,  0.75, 0  },
        });
    }
	
	@Test(timeout = 2000)
	public void testCalcularTiempoRespuestaParametrizado(int distancia, int altitud, int esperado) {
		int resultado = dron.calcularTiempoRespuesta(distancia, altitud);
		Assert.assertEquals(resultado, esperado);
	}
	
	@Test(timeout = 2000)
	public void testCalcularTiempoRespuestaSinPenalizacion() {
		int resultado = dron.calcularTiempoRespuesta(100, 80);
		Assert.assertEquals(resultado, 10);
	}
	
	@Test(timeout = 2000)
	public void testCalcularTiempoRespuestaConPenalizacion() {
		int resultado = dron.calcularTiempoRespuesta(50, 20);
		Assert.assertEquals(resultado, 6);
	}
	
	@Test(timeout = 2000)
	public void testCalcularTiempoRespuestaDistanciCero() {
		int resultado = dron.calcularTiempoRespuesta(0, 80);
		Assert.assertEquals(resultado, 0);
	}
	
	@Test(expected = IllegalArgumentException.class, timeout = 2000)
	public void testDistanciaNegativa() {
		dron.calcularTiempoRespuesta(-20, 80);
	}
	
	@Test(expected = ArithmeticException.class, timeout = 2000)
	public void testDronNoOperativo() {
		dron.setOperative(false);
		dron.calcularTiempoRespuesta(100, 40);
	}
	
	@Test(expected = ArithmeticException.class, timeout = 2000)
    public void testTiempoSuperaAutonomia() {
        dron.calcularTiempoRespuesta(1100, 10);
    }
	
}

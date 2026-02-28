package drones;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DronMaritimoTest {
	public static DronMaritimo dron;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dron = new DronMaritimo("DM1", 120, 10, false, 80);
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

	
	@Test(timeout = 2000)
	public void test() {
		fail("Not yet implemented");
	}

}

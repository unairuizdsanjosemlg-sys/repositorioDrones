package drones;

public class DronMaritimo extends Dron{
	// Variable especifica de la especializacion DronMaritimo.
	private int salinityResistance;
	
	// Constructor parametrizado de la clase DronMaritimo que hereda de la clase Dron.
	public DronMaritimo(String id, int maxAutonomy, int maxSpeed, String status, int salinityResistance) {
		super(id, maxAutonomy, maxSpeed, status);
		this.salinityResistance = salinityResistance;
	}

	// GETTERS y SETTERS
	public int getSalinityResistance() {
		return salinityResistance;
	}

	public void setSalinityResistance(int salinityResistance) {
		this.salinityResistance = salinityResistance;
	}
}

package drones;

public class DronMaritimo extends Dron{
	// Variable especifica de la especializacion DronMaritimo.
	private int salinityResistance;
	
	// Constructor parametrizado de la clase DronMaritimo que hereda de la clase Dron.
	public DronMaritimo(String id, int maxAutonomy, int maxSpeed, boolean operative, int salinityResistance) {
		super(id, maxAutonomy, maxSpeed, operative);
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

package drones;

public class DronMontano extends Dron{
	// Variable especifica de la especializacion DronMontano.
	private int altitude;
	
	// Constructor parametrizado de la clase DronMontano que hereda de la clase Dron.
	public DronMontano(String id, int maxAutonomy, int maxSpeed, boolean operative, int altitude) {
		super(id, maxAutonomy, maxSpeed, operative);
		this.altitude = altitude;
	}

	// GETTERS y SETTERS
	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
}

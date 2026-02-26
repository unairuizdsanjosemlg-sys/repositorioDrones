package drones;

public class DronMontano extends Dron{
	// Variable especifica de la especializacion DronMontano.
	private int altitude;
	
	// Constructor parametrizado de la clase DronMontano que hereda de la clase Dron.
	public DronMontano(String id, int maxAutonomy, int maxSpeed, String status, int altitude) {
		super(id, maxAutonomy, maxSpeed, status);
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

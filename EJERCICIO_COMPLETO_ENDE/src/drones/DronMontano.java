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
	
	// Metodo para calcular el tiempo de respuesta del dron montano.
	public int calcularTiempoRespuesta(int distancia, int altitude) {
		int tRespuesta = 0;
		if(distancia < 0) {
			throw new IllegalArgumentException("La distancia no puede ser negativa.");
		} else {
			if(isOperative() == false) {
				throw new ArithmeticException("El dron no está operativo.");
			} else {
				tRespuesta = distancia / getMaxSpeed();
				tRespuesta *= altitude;
				if(tRespuesta > getMaxAutonomy()) {
					throw new ArithmeticException("El tiempo de respuesta es mayor a la autonomia del dron.");
				}
			}
		}
		return tRespuesta;
	}
}

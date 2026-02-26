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
	
	// Método para calcular el tiempo de respuesta del dron maritimo;
	public int calcularTiempoRespuesta(int distancia, int salinityResistance) {
		int tRespuesta = 0;
		if(distancia < 0) {
			throw new IllegalArgumentException("La distancia no puede ser negativa.");
		} else {
			if(isOperative() == false) {
				throw new ArithmeticException("El dron no está operativo.");
			} else {
				tRespuesta = distancia / getMaxSpeed();
				if(salinityResistance < 30) {
					tRespuesta += (tRespuesta*20)/100;
					if(tRespuesta > getMaxAutonomy()) {
						throw new ArithmeticException("El tiempo de respuesta es mayor a la autonomia del dron.");
					}
				}
			}
		}
		return tRespuesta;
	}
}

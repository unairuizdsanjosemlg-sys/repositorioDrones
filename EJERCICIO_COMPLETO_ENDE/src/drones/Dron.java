package drones;

abstract class Dron {
	// Variables del objeto Dron.
	private String id;
	private int maxAutonomy;
	private int maxSpeed;
	private boolean operative;
	
	// Constructor parametrizado de la clase Dron.
	public Dron(String id, int maxAutonomy, int maxSpeed, boolean operative) {
		super();
		this.id = id;
		this.maxAutonomy = maxAutonomy;
		this.maxSpeed = maxSpeed;
		this.operative = operative;
	}
	
	// GETTERS y SETTERS
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMaxAutonomy() {
		return maxAutonomy;
	}
	public void setMaxAutonomy(int maxAutonomy) {
		this.maxAutonomy = maxAutonomy;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean isOperative() {
		return operative;
	}

	public void setOperative(boolean operative) {
		this.operative = operative;
	}
}

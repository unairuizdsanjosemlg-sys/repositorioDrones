package drones;

abstract class Dron {
	// Variables del objeto Dron.
	private String id;
	private int maxAutonomy;
	private int maxSpeed;
	private String status;
	
	// Constructor parametrizado de la clase Dron.
	public Dron(String id, int maxAutonomy, int maxSpeed, String status) {
		super();
		this.id = id;
		this.maxAutonomy = maxAutonomy;
		this.maxSpeed = maxSpeed;
		this.status = status;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

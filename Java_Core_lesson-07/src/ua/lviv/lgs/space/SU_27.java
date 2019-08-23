package ua.lviv.lgs.space;

public class SU_27 extends Plane implements TurboSpeedable, Stealthable, NuclearStrikable{
	
	private double maxSpeed;
	private String color;
	int stealth = (int) (Math.random()*100);
	int turbo = (int) (200 + Math.random()*300);
	int nuke = (int) (Math.random()*10);
	
	
	private AirplaneControl airplaneControl = new AirplaneControl();
	
	public void moveUp(int kilometer) {
		airplaneControl.moveUp(kilometer);
	}
	
	public void moveDown(int kilometer) {
		airplaneControl.moveDown(kilometer);
	}
	
	public void moveLeft(int kilometer) {
		airplaneControl.moveLeft(kilometer);
	}
	
	public void moveRight(int kilometer) {
		airplaneControl.moveRight(kilometer);
	}

	@Override
	public void turbo() {
		System.out.println("Speed of boost is " + turbo + " kilometers/second");
	}

	@Override
	public void stealth() {
		System.out.println("The plane is invisible for " + stealth + " seconds");		
	}

	@Override
	public void nuclear() {
		System.out.println("Amount of Nuclear Strikes available - " + nuke);
	}
	
	public void planeCharacteristics(double maxSpeed, String color) {
		System.out.println("Planes maximum speed is - " + maxSpeed + "km/s; and it's color is - " + color);
	}

	public SU_27(double maxSpeed, String color) {
		super();
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public AirplaneControl getAirplaneControl() {
		return airplaneControl;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAirplaneControl(AirplaneControl airplaneControl) {
		this.airplaneControl = airplaneControl;
	}

	@Override
	public String toString() {
		return "SU_27 [maxSpeed=" + maxSpeed + ", color=" + color + ", airplaneControl=" + airplaneControl
				+ ", toString()=" + super.toString() + "]";
	}
	

}

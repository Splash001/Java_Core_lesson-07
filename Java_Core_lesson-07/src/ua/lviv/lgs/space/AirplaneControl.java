package ua.lviv.lgs.space;

public class AirplaneControl {
	
	int up = (int)(Math.random()*100);
	int down = (int)(Math.random()*100);
	int left = (int)(Math.random()*100);
	int right = (int)(Math.random()*100);
	
	public void moveUp(int kilometer) {
		System.out.println("Plane moves UP for " + up + " kilomteres");
	}
	
	public void moveDown(int kilometer) {
		System.out.println("Plane moves DOWN for " + down + " kilomteres");
	}
	
	public void moveRight(int kilometer) {
		System.out.println("Plane moves RIGHT for " + right + " kilomteres");
	}
	
	public void moveLeft(int kilometer) {
		System.out.println("Plane moves LEFT for " + left + " kilomteres");
	}

}

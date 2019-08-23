package ua.lviv.lgs.space;

public class Main {
	public static void main(String[] args) {
		
		SU_27 plane = new SU_27(150.30, "Red");

		plane.engineStart();
		System.out.println("-------//----------");
		plane.planeTakeOff(0);
		System.out.println("-------//----------");
		plane.moveUp(1);
		plane.moveLeft(1);
		plane.moveDown(1);
		plane.moveRight(1);
		System.out.println("-------//----------");
		plane.stealth();
		System.out.println("-------//----------");
		plane.nuclear();
		System.out.println("-------//----------");
		plane.turbo();
		System.out.println("-------//----------");
		plane.planeLanding();
		
	}

}

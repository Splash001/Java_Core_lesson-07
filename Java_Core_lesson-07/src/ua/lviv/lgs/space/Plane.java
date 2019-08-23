package ua.lviv.lgs.space;

public abstract class Plane {
	
	int length;
	int width;
	int weight;
	
	int volume = length*width*weight;
	
	
	int a =(int) (Math.random()*(20+1)) + 67;
	int b = (int) (Math.random()*100);
	
	void engineStart() {
		System.out.println("The plane will be ready to take off in " + a + " seconds");
	}
	
	void planeTakeOff(int distance) {
		System.out.println("The plane traveled " + b + " kilometers");
	}
	
	void planeLanding() {
		System.out.println("The plane is landing");
	}
	
	void planeVolume(int length, int width, int weight) {
		System.out.println("The volume of plane is " + volume + " meters qubical");
	}

}

package module_1;

public class Exercise06_09 {

	public static void main(String[] args) {
		System.out.println("Feet   Meters     Meters   Feet");
		System.out.println("---------------------------------");
		double foot = 1.0;
		double meters;
		double meter = 20.0;
		double feet;
		
		for (int i = 0; i < 10; i++) {
			System.out.print(foot + "    ");
			meters = footToMeter(foot);
			System.out.printf("%.3f      ", meters); 
			System.out.print(meter + "     ");
			feet = meterToFoot(meter);
			System.out.printf("%.3f", feet); 
			System.out.println();
			foot++;
			meter = meter + 5.0;
		}
	}
	
	/** Convert from feet to meters */
	public static double footToMeter(double foot) {
		double meter = 0.305 * foot;
		return meter;
	}

	/** Convert from meters to feet */
	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		return foot;
	}

}

package chapter13;

public class OctagonTest {

	public static void main(String[] args) {
		// Create the first Octagon with a specific side length
        Octagon octagon1 = new Octagon(5.0);
        System.out.println("First Octagon: " + octagon1);

        // Clone the first Octagon into a second
        Octagon octagon2 = null;
        try {
            octagon2 = (Octagon) octagon1.clone();
            System.out.println("Cloned Octagon: " + octagon2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported.");
        }

        // Compare the two Octagons
        if (octagon1.compareTo(octagon2) == 0) {
            System.out.println("The two octagons have the same area.");
        } else if (octagon1.compareTo(octagon2) > 0) {
            System.out.println("The first octagon has a larger area than the second.");
        } else {
            System.out.println("The second octagon has a larger area than the first.");
        }

	}

}

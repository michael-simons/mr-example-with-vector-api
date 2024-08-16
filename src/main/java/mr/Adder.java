package mr;

public class Adder {

	int[] add(int[] a, int[] b) {
		System.out.println("Using a loop");

		var c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}
}

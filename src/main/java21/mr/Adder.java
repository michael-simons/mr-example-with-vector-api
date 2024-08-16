package mr;

import jdk.incubator.vector.IntVector;

public class Adder {

	int[] add(int[] a, int[] b) {
		System.out.println("Using jdk.incubator.vector");

		int[] c = new int[a.length];

		var species = IntVector.SPECIES_PREFERRED;

		for (int i = 0; i < c.length; i += species.length()) {
			var aVector = IntVector.fromArray(species, a, i);
			var bVector = IntVector.fromArray(species, b, i);
			aVector.add(bVector).intoArray(c, i);
		}
		return c;
	}
}

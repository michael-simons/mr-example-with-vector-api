package mr;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class App {

	public static void main(String...args) {
		var l = args.length == 0 ? 8 : Integer.parseInt(args[0]);
		var tlr = ThreadLocalRandom.current();
		var a = tlr.ints(l, 0, 128).toArray();
		var b = tlr.ints(l, 0, 128).toArray();

		System.out.println("Computing " + Arrays.toString(a) + " + " + Arrays.toString(b));
		var c = new Adder().add(a, b);
		System.out.println(Arrays.toString(c));
	}
}

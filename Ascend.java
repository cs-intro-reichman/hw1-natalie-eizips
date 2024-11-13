// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		
		int range = Integer.parseInt(args[0]);

		int a = (int)(Math.random() * range + 1);
		int b = (int)(Math.random() * range + 1);
		int c = (int)(Math.random() * range + 1);

		int min = Math.min(Math.min(a,b),c);
		int max = Math.max(Math.max(a,b),c);
		int middle = Math.max(Math.min(a, b), Math.min(b,c));

		System.out.println(min + " " + middle + " " + max);
	}
}

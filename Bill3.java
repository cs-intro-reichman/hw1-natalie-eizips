// Splits a restaurant bill evenly among three diners.
public class Bill3 {
 	public static void main(String[] args) {
		// To get you started, here is the first line in the program:

			String name1 = args[0]; //First name
	    	String name2 = args[1]; //Second name
	    	String name3 = args[2]; //Third name

		Double bill = Double.parseDouble(args[3]);

		double payment = Math.round((bill / 3) + 0.49);

		System.out.println("Dear " + name3 + ", " + name2 + ", and" + name1 + ": pay " + payment + " Shekels each");	
	}
}

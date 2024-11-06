// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

        int current_value = Integer.parseInt(args[0]);
        int percentage = Integer.parseInt(args[1]);
        int years = Integer.parseInt(args[2]);

        double rate = ((double) percentage) / 100;

        double future_value = current_value * Math.pow(1 + rate, years);
        int future_value1 = (int) future_value;

        System.out.println("After " + years + " years, $" + current_value + " saved at " + percentage + "% will yield at $" + future_value1 + ".");
    }


package telran.additional1;

public class NumberConverter {
	public static String toBinaryStr(int number) {
		if (number == 0) {
			return "0";
		}
		String binary = "";
		while (number > 0) {
			binary = (number % 2) + binary;
			number /= 2;
		}
		return binary;
	}
}
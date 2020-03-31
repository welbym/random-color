import java.util.*;
import java.lang.*;

public class RandomColor {
/**
 * holds int values for hex digits
 */
private ArrayList<Integer> digits;

/**
 * represents hex color
 */
private String hexColor;

/**
 * Random class used to get random digits
 */
private Random rndm;
RandomColor() {
	// add the hex digits to a list
	digits = new ArrayList<Integer>();
	for (int num = 0; num < 16; num++) {
		digits.add(num);
	}

	// sets blank value for hexColor
	hexColor = "";

	// sets random
	rndm = new Random();
}

protected void setColor() {
	hexColor += "#";
	for (int i = 0; i < 6; i++) {
		hexColor += Character.forDigit(digits.get(rndm.nextInt(16)), 16);
	}
}

protected String getColor() {
	if (digits == null) {
		return "";
	}
	return hexColor;
}

public static void main(String[] args) {
	RandomColor rndmClr = new RandomColor();
	Scanner scn = new Scanner(System.in);

	rndmClr.setColor();
	System.out.println(rndmClr.getColor());
}
}

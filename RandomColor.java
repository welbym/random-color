import java.util.*;
import java.lang.*;

/** represents random color */
public class RandomColor {
/** holds int values for hex digits */
private ArrayList<Integer> digits;

/** represents hex color */
private String hexColor;

/** Random class used to get random digits */
private Random rndm;
public RandomColor() {
	// add the hex digits to a list
	digits = new ArrayList<Integer>();
	for (int num = 0; num < 16; num++) {
		digits.add(num);
	}

	// sets blank value for hexColor
	hexColor = "#";

	// sets random
	rndm = new Random();
}

public void setColor() {
	for (int i = 0; i < 6; i++) {
		hexColor += Character.toUpperCase(Character.forDigit(digits.get(rndm.nextInt(16)), 16));
	}
}

public String getColor() {
	if (digits == null) {
		return "";
	}
	return hexColor;
}
}

import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;

/** represents random color */
public class RandomColor {
/** holds int values for hex digits */
private ArrayList<Integer> digits;

/** represents RGB color */
private Color rgbColor;

/** represents Hex color */
private String hexColor;

/** Random class used to get random digits */
private Random rndm;

/** Constructor */
public RandomColor() {
	// add the hex digits to a list
	digits = new ArrayList<Integer>();
	for (int num = 0; num < 16; num++) {
		digits.add(num);
	}

	// sets Color object with 0 values
	rgbColor = new Color(0, 0, 0);

	// sets blank value for hexColor
	hexColor = "";

	// sets random
	rndm = new Random();
}

/** set RGB color */
public void setRGBColor() {
	rgbColor = new Color(rndm.nextInt(255), rndm.nextInt(255), rndm.nextInt(255));
}

/** get RGB color */
public String getRGBColor() {
	if (rgbColor == null) {
		return "";
	}
	return rgbColor.toString();
}

/** set Hex color */
public void setHexColor() {
	hexColor = "#";
	for (int i = 0; i < 6; i++) {
		hexColor += Character.toUpperCase(Character.forDigit(digits.get(rndm.nextInt(16)), 16));
	}
}

/** get Hex color */
public String getHexColor() {
	if (digits == null) {
		return "";
	}
	return hexColor;
}
}

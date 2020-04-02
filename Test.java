import java.util.*;
import java.lang.*;

public class Test {
public static void main(String[] args) {
	RandomColor rndmClr = new RandomColor();
	Scanner scn = new Scanner(System.in);

	rndmClr.setHexColor();
	System.out.println(rndmClr.getHexColor());

	rndmClr.setRGBColor();
	System.out.println(rndmClr.getRGBColor());
}
}

package day008;

public class CaclAngles {

	public static void main(String[] args){
		int x1 = 90, y1 = 180;
		int x2 = 205, y2 = 85;
		int x3 = 310, y3 = 240;
		
		double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double c = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double RA = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
		double RB = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
		double RC = Math.acos((c * c - b * b - a * a) / (-2 * b * a));
		
		double degreeA = Math.toDegrees(RA);
		double degreeB = Math.toDegrees(RB);
		double degreeC = Math.toDegrees(RC);
		
		System.out.println(degreeA);
		System.out.println(degreeB);
		System.out.println(degreeC);
				
		
	}
}

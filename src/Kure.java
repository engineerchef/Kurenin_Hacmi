import java.util.Scanner;

public class Kure {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		double r;
		System.out.print("Kürenin yarýçapýný giriniz : ");
		r = s.nextDouble();
		
		System.out.printf("Kürenin hacmi : %f", hacim(r));
	}
	
	// public static double hacim(double r) {
	private static double hacim(double r) {
		double v = (4.0/3.0)*Math.PI*Math.pow(r, 3);
		return v;
	}
}

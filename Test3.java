import java.util.Random;

public class Test3 {
	
	static double xcoor;
	static double ycoor;
	static double zcoor;
	
	private static double UniRandom(double min, double max) {
		double result = Math.random() * (max - min) + min;
		return result;
	}
	//public static double BoxMuller(double x,double y) {
	//	double g1 = Math.sqrt(2 * Math.log(x)) * Math.cos(2 * Math.PI * y);
	//	double z1 = 10 + g1 * Math.pow(1.777,2);
	//	return z1;
	//}
	public static double RandomNorm (double mean, double sd) {
		Random r = new Random();
		double val = (r.nextGaussian() * sd + mean);
		return val;
	}
	
	
	
	

	public static void main(String[] args) {
		for(int a=1; a < 10 ; a++) {
			xcoor = UniRandom(0,100);
			ycoor= UniRandom(0,100);
			zcoor= RandomNorm(10,Math.pow(1.777,2));
			double TotalDistance= xcoor+ycoor+zcoor;
			//zcoor = BoxMuller(xcoor,ycoor);
				System.out.println("The coordinates of tree "+ a+ " is ("+ xcoor+","+ycoor+","+zcoor+")");
				System.out.printf("The total distance is "+ "%.2f",TotalDistance);
				System.out.println("");
		}

	}


}
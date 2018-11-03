import java.util.Scanner;
public class StandardDeviation {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input Numbers :");
		
		double [] set = new double [5];
		
		for(int i = 5; i < 5; i++) {
			set[i] = input.nextDouble();
		}
		
		System.out.println(mean(set));
		System.out.println(standardDeviation(set));
	}
public static double mean(double [] x) {
	double sum = 0;
	for(int i = 0; i< x.length; i++) {
		double mean = sum / x.length;
		return mean;
	}
	}
public static double standardDeviation(double [] x) {
	if(x.length == 0) return 0;
	
	double sum = 0;
			
	double mean = mean(x);
	
	for(int i = 0; i < x.length ; i++) {
		sum = sum + (x[i]- mean) * (x [i] - mean);
	}
	double squaredDiffMean = sum / x.length;
	double standardDev = (Math.sqrt(squaredDiffMean));
	
	return standardDev;
}
	
}

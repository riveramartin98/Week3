package MyFirstProject;

public class number10 {

	
	public static double average(double[] arr) {
	    double sum = 0;
	    for (double value : arr) {
	        sum += value;
	    }
	    return sum / arr.length;
	}


}

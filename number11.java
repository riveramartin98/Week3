package MyFirstProject;

public class number11 {

	public static boolean compareArrays(double[] arr1, double[] arr2) {
	    double avg1 = average(arr1);
	    double avg2 = average(arr2);
	    return avg1 > avg2;
	}

	public static double average(double[] arr) {
	    double sum = 0;
	    for (double value : arr) {
	        sum += value;
	    }
	    return sum / arr.length;
	}

}

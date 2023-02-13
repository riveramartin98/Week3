package MyFirstProject;
import java.util.Arrays;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//1a		
int [] ages = {3,9,23,64,2,8,28,93};
int Results = ages [ages.length -1] - ages [0];
System.out.println(Results);

int [] newAge = Arrays.copyOf(ages, ages.length + 1);
newAge[newAge.length - 1] = 35;
Results = newAge[newAge.length - 1] - newAge[0];
System.out.println(Results);

//1b
int total = 0;
for (int i = 0; i < newAge.length; i++) {
	total += newAge[i];
}

//1c
double average = (double) total / newAge.length;
System.out.println(average);

//2a
String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
int totalLetters = 0;

for (String name : names) {
	totalLetters = totalLetters + name.length();
}
double averageLetters = (double) totalLetters / names.length;
System.out.println("The average number of letters per name is : " + averageLetters);

//2b
String allNames = "";
for (String name : names) {
	allNames = allNames + name + " ";
}
System.out.println("All names: " + allNames);	
		
//5 

int [] nameLengths = new int[names.length];

for (int i = 0; i < names.length; i++) {
	nameLengths[i] = names[i].length();
	
}
//6
int sum  = 0;
for (int length : nameLengths ) {
	sum = sum + length;
	
}
System.out.println("The sum is equal to: " + sum);
}

	
}
	




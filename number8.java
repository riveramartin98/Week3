package MyFirstProject;

public class number8 {

	public static void main(String[] args) {

		

		String firstName = "Martin";
		String lastName = "Rivera";
		String fullName = createFullName(firstName, lastName);
		
		//System.out.println(fullName);

	}
public static String createFullName(String firstName, String lastName) {
	String fullName = firstName + " " + lastName;
	return fullName;
}
}

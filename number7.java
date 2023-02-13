package MyFirstProject;

public class number7 {

	public static String repeatWord(String word, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(word);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String word = "Hello";
		int n = 3;
		String result = repeatWord(word,n);
		System.out.println(result);
	}

	
	
	
	
}

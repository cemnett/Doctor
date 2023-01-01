import java.util.ArrayList;
import java.util.Scanner;

public class GetSymptoms {
	static ArrayList<String> symptoms = new ArrayList<String>();
	
	public static void main(String args[]) {
		
	
	//public ArrayList<String> inputSymptoms() {
		System.out.println("Please enter your symptoms below! Once you're done, type 'next' to continue.");
		String input = "";
		
		Scanner sc = new Scanner(System.in);
		
		while(!input.equals("next")) {
			System.out.print("Symptom: ");
			input = sc.nextLine().toLowerCase();
			if(!input.equals("next")) {
				symptoms.add(input);
			}
		}
		
		for(String x : symptoms) {
			System.out.println(x);
		}
	}
	//}
}

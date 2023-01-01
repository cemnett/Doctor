import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Patient {
	private String firstName;
	private String lastName;
	
	//symptoms inputed by patient placed into an array
	private ArrayList<String> symptoms = new ArrayList<String>();
	
	//possible illnesses in a list of maps in order to put the name of the illness first and then quantity of matching symptoms
	private List<Map<String,Integer>> illnesses = new ArrayList<Map<String,Integer>>();

	Patient(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First name: ");
		this.firstName = sc.nextLine();
		
		System.out.println("Last name: ");
		this.lastName = sc.nextLine();
		
		System.out.println("Welcome " + this.firstName + "! I am your personal medical AI.\n");
		
		setSymptoms();
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public ArrayList<String> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms() {
		System.out.println("Please enter your symptoms below! Once you're done, type 'next' to continue.\n");
		String input = "";
		
		Scanner sc = new Scanner(System.in);
		
		while(!input.equals("next")) {
			System.out.print("Symptom: ");
			input = sc.nextLine().toLowerCase();
			if(!input.equals("next")) {
				symptoms.add(input);
			}
		}
		sc.close();
	}
	
	//illnesses.add(new HashMap<String,Integer>());
	
	
}

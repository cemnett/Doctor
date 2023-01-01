import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Patient {
	private String firstName;
	private String lastName;
	
	//symptoms inputed by patient placed into an array
	ArrayList<String> symptoms = new ArrayList<String>();
	
	//possible illnesses in a list of maps in order to put the name of the illness first and then quantity of matching symptoms
	List<Map<String,Integer>> illnesses = new ArrayList<Map<String,Integer>>();

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

	public void setSymptoms(ArrayList<String> symptoms) {
		this.symptoms = symptoms;
	}
	
	//illnesses.add(new HashMap<String,Integer>());
	
	
}

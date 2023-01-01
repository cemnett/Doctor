import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GetIllnesses{
	public static String[][] illnesses = new String[6][6];
	
	static String inputFile = "src/IllnessesDatabase.csv";
	
	public static void ReadInIllnesses() {
		int index = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File(inputFile));
			sc.useDelimiter(",");   //sets the delimiter pattern  
			while (sc.hasNextLine())  //returns a boolean value  
			{  
				String[] illness = sc.nextLine().split(",");
				illnesses[index] = illness;
				index++;
			}   
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found.");
			e.printStackTrace();
		}  
		System.out.print(illnesses[5].length);
	}
	
}

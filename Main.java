import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = 3;
	    int[] inputArray = new int[size];
	    
	    System.out.println("Enter the three numbers to be calculated: ");
    	for(int i=0; i<=size; i++) {
    		if (i==3) {
    			break;
    		}
    		inputArray[i] = sc.nextInt();
    	}
    	sc.close();
	    System.out.println(mathFunction(inputArray));
	    
	    
	}
	
	public static ArrayList<String> mathFunction(int[] userArray) {
		ArrayList<String> equations = new ArrayList<>();
		String nope = "None";
		if (userArray[0] + userArray[1] == userArray[2]) {
			String sum = "+";
			equations.add(sum);
		}
		if (userArray[0] - userArray[1] == userArray[2]) {
			String subtract = "-";
			equations.add(subtract);
		}
		if (userArray[0] * userArray[1] == userArray[2]) {
			String multi = "*";
			equations.add(multi);
		}
		if (userArray[0] / userArray[1] == userArray[2]) {
			String div = "/";
			equations.add(div);
		}
		if (equations.isEmpty()) {
			equations.add(nope);
		}
		return equations;
		
	}
}
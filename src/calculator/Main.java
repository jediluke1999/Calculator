package calculator;

import java.util.Scanner;  // Import the Scanner class

public class Main {
	
	static public Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] arg) {
		EventHandlers.CallForOperator();
		EventHandlers.CallForInputs();
		Operator.returnOperator();
		System.out.println("The " + Operator.operatorType[Input.parsedSelection - 1] + " of your two numbers is " + Operator.operatorResult + ".");	
	}
}
package calculator;


public class EventHandlers {
	
	static boolean errorStatus = true;

	static void CallForInputs() {
		errorStatus = true;
		while (errorStatus == true) {
			try {
				System.out.println("Give me your first input.");
				Input.inputOne = Main.userInput.nextLine();
				
				Input.parsedInputOne = Float.parseFloat(Input.inputOne);
				System.out.println("Now give me your second one.");
				
				Input.inputTwo = Main.userInput.nextLine();
				Input.parsedInputTwo = Float.parseFloat(Input.inputTwo);
				
				errorStatus = false;
			} catch (Exception e) {
				System.out.println("You're wasting my time; try again!\n");
			}
		}
	}
	
	static void CallForOperator() {
		errorStatus = true;
		System.out.println("Please select a number the following:\n1)Addition\n2)Subtraction\n3)Division\n4)Multiplication");
		while (errorStatus == true) {
			try {
				Input.selection = Main.userInput.nextLine();
				Input.parsedSelection = Integer.parseInt(Input.selection);
				
				if (Input.parsedSelection < 1 | Input.parsedSelection > 4) {
					System.out.println("That option's not on the list; try again!");
				} else {
					errorStatus = false;
				}
			} catch (Exception e) {
				System.out.println("You know absolutely well that is not an option to choose from. At least choose a number!");
			}
		}
	}
	static void TryAgain() {
		errorStatus = true;
		while (errorStatus = true) {
			System.out.println("Would you like to operate another two numbers? Yes or no?");
			Input.inputOne = Main.userInput.nextLine();
			if (Input.inputOne.equalsIgnoreCase("yes")) {
				CallForOperator();
				CallForInputs();
				Operator.returnOperator();
				System.out.println("The " + Operator.operatorType[Input.parsedSelection - 1] + " of your two numbers is " + Operator.operatorResult + ".");	
			} else if (Input.inputOne.equalsIgnoreCase("no")){
				System.out.println("Well, thank you for your time!");
				errorStatus = false;
				break;
			} else {
				System.out.println("That's not a yes or no! Again...\n");
			}
		}
		
	}
}

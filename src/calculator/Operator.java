package calculator;

public class Operator {
	
	static String[] operatorType = {"sum", "difference","quotient", "product"};
	static float operatorResult;
	
	static float Add() {
		return (Input.parsedInputOne + Input.parsedInputTwo);
	}
	static float Subtract() {
		return (Input.parsedInputOne - Input.parsedInputTwo);
	}
	static float Divide() {
		return (Input.parsedInputOne / Input.parsedInputTwo);
	}
	static float Multiply() {
		return (Input.parsedInputOne * Input.parsedInputTwo);
	}
	
	static void returnOperator() {
		switch (Input.parsedSelection) {
			case 1:
				operatorResult = Add();
				break;
			case 2:
				operatorResult = Subtract();
				break;
			case 3:
				operatorResult = Divide();
				break;
			case 4:
				operatorResult = Multiply();
				break;
			default:
				throw new ArithmeticException("I literally have no clue how you got here.");
		}
	}
}

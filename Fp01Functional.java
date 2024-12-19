//print all number in list structure

import java.util.List;

public class Fp01Functional {

	public static void main(String[] args) {
		printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,1));

	}
	
	private static void print (int number) {
		System.out.println(number);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//[12,9,13,4,6,2,4,12,1] - List of numbers in sequence of Element
		
		numbers.stream()
			.forEach(Fp01Functional::print);
	}

}

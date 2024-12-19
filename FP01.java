//print all number in list structure

import java.util.List;

public class FP01 {

	public static void main(String[] args) {
		printAllNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,1));

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		for (int integer : numbers) {
			System.out.println(integer);
		}
		
	}

}

import java.util.List;

public class Fp01StructuredEvenNumbers {
	public static void main(String[] args) {
		List<Integer> numbers =(List.of(12,9,13,4,6,2,4,12,1));
		printEvenNumbersInListStructured(numbers);
	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		//Filter - only allow even numbers
		numbers.stream()
			.filter(number->number%2==0)
			.forEach(System.out::println);
	}
}

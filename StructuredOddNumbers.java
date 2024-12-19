import java.util.List;

public class StructuredOddNumbers {
	public static void main(String[] args) {
		List<Integer> numbers =(List.of(12,9,13,4,6,2,4,12,1));
		printOddNumbersInListStructure(numbers);
	}
	private static void printOddNumbersInListStructure(List<Integer> numbers) {

		numbers.stream()
			.filter(number->number%2!=0)
			.forEach(System.out::println);
	}
}

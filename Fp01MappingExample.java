import java.util.List;

public class Fp01MappingExample {
	public static void main(String[] args) {
		List<Integer> numbers =(List.of(12,9,13,4,6,2,4,12,1));
		
		printSquaresOfEvenNumbers(numbers);
		
		System.out.println("----------------------------------------------");
		
		List<String> courseStrings = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "AZURE");
		courseStrings.stream()
			.map(course->course.length())
			.forEach(System.out::println);
	}

	private static void printSquaresOfEvenNumbers(List<Integer> numbers) {
		numbers.stream()
			.filter(number->number%2==0)
			.map(number->number*number)
			.forEach(System.out::println);
	}
}

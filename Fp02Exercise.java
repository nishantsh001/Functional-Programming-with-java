import java.util.List;

public class Fp02Exercise {
	public static void main(String[] args) {
		List<String> courseStrings = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "AZURE");
		
		courseStrings.stream()
			.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");
		
		courseStrings.stream()
			.filter(course->course.contains("Spring"))
			.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");
		
		courseStrings.stream()
		.filter(course->course.length()>=4)
		.forEach(System.out::println);
	}
	
	
}

package com.jdk8.test4;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;
 
public class Java8Counter {
	public static void main(String[] args) {
		String[] arr = { "program", "creek", "program", "creek", "java", "web",
				"program" };
		Stream<String> stream = Stream.of(arr).parallel();
		Map<String, Long> counter = stream.collect(Collectors.groupingBy(
				String::toString, Collectors.counting()));
		System.out.println(counter.get("creek"));
	}
}
package com.rm.fp;

import java.util.function.Predicate;

public class FunctionalJavaApplication {

	public static void main(String[] args) {
		// SpringApplication.run(FunctionalJavaApplication.class, args);
		System.out.println("Hello Rishav");
//		Predicate<String> predicate = x -> x.contains("Hi");
//		System.out.println(predicate.and(str -> str.contains("Hello")).test("Hi Rishav Hello"));

		testPredicate("Hello", str -> str.contains("Rishav"), x -> x.contains("Hi"));
	}

	private static void testPredicate(String input, Predicate<String> p1, Predicate<String> p2) {
		System.out.println(p1.or(Predicate.not(p2)).test(input));

	}

}

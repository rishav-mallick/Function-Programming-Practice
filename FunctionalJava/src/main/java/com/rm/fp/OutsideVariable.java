package com.rm.fp;

import java.util.ArrayList;
import java.util.List;

public class OutsideVariable {

	public static void main(String[] args) {
		var ans = 45;

		Runnable printAns = () -> System.out.println("The ans is " + ans);
		run(printAns);
//		ans = 34;//cannot change the effectively final value of ans since used in lambda
		
		
//		*************
		List<String> wordList = new ArrayList<>();
//		wordList= List.of("Troy");// if this is initialized, the same variable cannot be used in lamda.uncomment to check
//		var wordlist1 = wordList;//workaround by assigning to another variable which can be used in lambda then
		Runnable addition = () -> wordList.add("Hello");
		addition.run();
		wordList.add(null);//only the reference cannot be changed. underlying data structure can be changed
		System.out.println(wordList);
	}

	private static void run(Runnable printAns) {
		printAns.run();

	}

}

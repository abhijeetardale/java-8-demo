package com.stream.examples;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FindSumOfAllEvenNumbersBetween1To5 {

	public static void main(String[] args) {

		IntPredicate pr = n-> n % 2 == 0;

		// Find sum of all even numbers between 1 to 5
		int sum = IntStream.of(1, 2, 3, 4, 5).filter(n-> n % 2 == 0).sum();
		System.out.println("Sum is: " + sum);

		int sum1 = IntStream.of(1, 2, 3, 4, 5).filter(pr).sum();
		System.out.println("Sum is: " + sum1);
	}

}

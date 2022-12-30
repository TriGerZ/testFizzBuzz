package testfizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Programming
Fizz buzz has been used as an interview screening device for computer programmers.
Writing a program to output the first 100 FizzBuzz numbers.

For example, a typical round of fizz buzz would start as follows:

1, 2, Fizz, 4, Buzz, Fizz, 7, 8,
Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17,
Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26,
Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, ...

Should_ExpectedBehavior_When_StateUnderTest

 */

public class FizzBuzzTest {
	private final FizzBuzz fizzbuzz;

	public FizzBuzzTest() {
		this.fizzbuzz = new FizzBuzz();
	}

	@Test
	public void should_Return1_When_Input1(){
		//Given
		int inputNumber = 1;
		//When
		String result = fizzbuzz.generate(inputNumber);
		//Then
		assertEquals("1",result);
	}

	@Test
	public void should_Return2_When_Input2(){
		//Given
		int inputNumber = 2;
		//When
		String result = fizzbuzz.generate(inputNumber);
		//Then
		assertEquals("2",result);
	}

	@Test
	public void should_ReturnFizz_When_Input3(){
		//Given
		int inputNumber = 3;
		//When
		String result = fizzbuzz.generate(inputNumber);
		//Then
		assertEquals("Fizz",result);
	}

	@Test
	public void should_ReturnFizz_When_Input9(){
		//Given
		int inputNumber = 9;
		//When
		String result = fizzbuzz.generate(inputNumber);
		//Then
		assertEquals("Fizz",result);
	}

	@Test
	public void should_ReturnBuzz_When_Input5(){
		//Given
		int inputNumber = 5;
		//When
		String result = fizzbuzz.generate(inputNumber);
		//Then
		assertEquals("Buzz",result);
	}

	@Test
	public void should_ReturnBuzz_When_Input10(){
		//Given
		int inputNumber = 10;
		//When
		String result = fizzbuzz.generate(inputNumber);
		//Then
		assertEquals("Buzz",result);
	}

	@Test
	public void should_ReturnFizzBuzz_When_Input15(){
		//Given
		int inputNumber = 15;
		//When
		String result = fizzbuzz.generate(inputNumber);
		//Then
		assertEquals("FizzBuzz",result);
	}

	@Test
	public void should_ReturnFizzBuzz_When_Input30(){
		//Given
		int inputNumber = 30;
		//When
		String result = fizzbuzz.generate(inputNumber);
		//Then
		assertEquals("FizzBuzz",result);
	}

	@Test
	public void should_Return12Fizz_When_Input1to3(){
		//Given
		int startNumber = 1;
		int endNumber = 3;

		//When
		String result = fizzbuzz.generateFizzBuzzSuit(startNumber, endNumber);

		//Then
		assertEquals("1, 2, Fizz", result);
	}

	@Test
	public void should_Return_12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz_When_Input1to15(){
		//Given
		int startNumber = 1;
		int endNumber = 15;

		//When
		String result = fizzbuzz.generateFizzBuzzSuit(startNumber, endNumber);

		//Then
		assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz", result);
	}

}

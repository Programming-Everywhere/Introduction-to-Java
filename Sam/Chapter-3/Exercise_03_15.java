
  
/*
(Random point) Write a program that displays a random coordinate in a rectangle.
The rectangle is centered at (0, 0) with width 100 and height 200.
*/
public class Exercise_03_16 {
	public static void main(String[] args) {
		// Generate random width and height
		int width = (int)((Math.random() * (50 + 50)) -50);
		int height = (int)((Math.random() * (100 + 100)) -100);

		// Display coordinate
		System.out.println("Random coordinate in rectangle centered at (0,0)");
		System.out.println(
			"with width 100 and height 200: (" + width + ", " + height + ")");
	}
}






















		// Extract digits from lottery
		int lotteryDigit1 = lottery / 100;

		int lotteryDigit2 = remainingDigits / 10;
		int lotteryDigit3 = remainingDigits % 10;

		// Extract digits from guess
		int guessDigit1 = guess / 100;
		int remainingDigits = guess % 100;
		int guessDigit2 = remainingDigits / 10;
		int guessDigit3 = remainingDigits % 10;

		System.out.println("The lottery number is " + lottery);

		// Check the guess
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		if (guessDigit1 == lotteryDigit2)
		{

		}
	}
}

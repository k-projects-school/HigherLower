package be.my_portfolio.guesser;

import java.util.*;

public class HigherLower {

	public static void main(String[] args) {
		/*
		 * Because we will need to get input from a user we'll need an instance of the
		 * Scanner class. This class has methods to get the input that's needed from the
		 * user.
		 */
		Scanner kbd = new Scanner(System.in);

		/**
		 * To generate a random number, we'll need an instance of the Random class.
		 */
		Random random = new Random();

		/*
		 * With the nextInt method from the Random class We will get a random generated
		 * number. Because we don't want that the number is going to be to high, We will
		 * give a parameter with the value of 100. In this case, the random number will
		 * be between 0 and 100.
		 */
		int numberToGuess = random.nextInt(100);

		/**
		 * The System class has a wide range of methods ands sub classes. To put some
		 * text in the console, We'll use the sub class' out println method. As
		 * parameter it accepts a string.
		 */
		System.out.println("Enter a number between 0 and 100: ");

		/**
		 * Because we need to check if the user has guessed the right number, We'll need
		 * a variable of the boolean type. A boolean variable can hold true or false.
		 */
		boolean guessed = false;

		/*
		 * We want to remember how many times a user has to guess before He/She guessed
		 * right. For this We'll create a count variable of the int type. An int
		 * variable can hold only numbers without a decimal point.
		 */
		int count = 0;

		/**
		 * We want that the user can play until he guessed it right. In this case We can
		 * use a while loop. A while loop will execute the code block as long as a given
		 * condition is true. So We'll give the guessed variable as condition, because
		 * as long the user didn't guessed right the code will be executed again.
		 */
		while (!guessed) {
			/*
			 * Every time the code block is repeated, We want that the count is 1 more than
			 * before. You'll see that we use count++ to increment the count. This will do
			 * the same as "count = count + 1;".
			 */
			count++;

			/*
			 * Here We will use the nextInt method of the Scanner instance. This will get
			 * the first integer that is typed by the user. In this case there will be an
			 * error if a user enters an alphabetical character.
			 */
			int guess = kbd.nextInt();

			/*
			 * If the user enters a number that is higher than 100. We'll need to let it
			 * know to the user.
			 */
			if (guess > 100) {
				count--;
				System.out.println(
						"The number you entered is higher than 100, please choose a number between 0 and 100.");
			}
			/*
			 * If the user enters a negative number (ex: -1), we'll need to let it know.
			 */
			else if (guess < 0) {
				count--;
				System.out.println("The number you entered is lower than 0, please choose a number between 0 and 100.");
			}
			/*
			 * If the number is lower than the number He/She needs to guess. We will let him
			 * know that He/She needs to guess higher.
			 */
			else if (guess < numberToGuess) {
				System.out.println("Higher!");
			}
			/*
			 * If the number is higher than the number He/She needs to guess. We will let
			 * him know that He/She needs to guess lower.
			 */
			else if (guess > numberToGuess) {
				System.out.println("Lower!");
			}
			/*
			 * In all other cases is the number, entered by the user, the same as the number
			 * that's needed to guess. In this case We will set the guessed boolean to true
			 * and this will stop the while loop. And We will let Him/Her know that he
			 * guessed it right and how many times He/She needed to guess.
			 */
			else {
				guessed = true;
				System.out.println("You guessed the number in " + count + " times.");
			}
		}

		/*
		 * Because We don't need the Scanner instance anymore we can close the Scanner.
		 */
		kbd.close();
	}

}

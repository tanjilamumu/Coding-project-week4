package codingprojectweek4;

import java.lang.reflect.Array;

public class CodingProjectWeek4 {

	public static void main(String[] args, String name) {
		// TODO Auto-generated method stub

		
        // Problem 6
		int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
		
        int sumOfNameLengths = 0;
        for (int length : nameLengths) {
            sumOfNameLengths += length;
        }
        System.out.println("Sum of name lengths: " + sumOfNameLengths);

        // Problem 7
        System.out.println(concatenateWordNTimes("Hello", 3));

        // Problem 8
        System.out.println(createFullName("John", "Doe"));

        // Problem 9
        System.out.println(isSumGreaterThan100(ages));

        // Problem 10
        System.out.println(calculateAverage(ages));

      

        // Problem 12
        System.out.println(willBuyDrink(true, 12.50));

        // Problem 13
        // I'll leave this for you to create based on your specific needs.
    }

    // Problem 7
    static String concatenateWordNTimes(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }

    // Problem 8
    static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // Problem 9
    static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum > 100;
    }

    // Problem 10
    static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    
    }

    // Problem 12
    static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }
}
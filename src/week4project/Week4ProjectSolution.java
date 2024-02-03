package week4project;

public class Week4ProjectSolution {

	public static void main(String[] args) {
		
		// Problem 1
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // a.
        int result = ages[ages.length - 1] - ages[0];
        System.out.println("Result of subtraction: " + result);

        // b.
        int[] ages2 = new int[9];
        for (int i = 0; i < ages2.length; i++) {
            ages2[i] = i + 1;
        }
        int result2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Result of subtraction in ages2: " + result2);

        // c.
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double average = (double) sum / ages.length;
        System.out.println("Average age: " + average);

        // Problem 2
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // a.
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.println("Average number of letters per name: " + averageLetters);

        // b.
        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : names) {
            concatenatedNames.append(name).append(" ");
        }
        System.out.println("Concatenated names: " + concatenatedNames);

        // Problem 3
        // Accessing the last element of an array: array[array.length - 1]
        //problem 4
        // Accessing the first element of an array: array[0]

        // Problem 5
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // Problem 6
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
    
    // Problem 11
    
    public static boolean arrayTest(int one, int two) {
    	double[] doubOne = new double[one];
    	double[] doubTwo = new double[two];
    	
    	double doubAvgOne = 0;
    	double doubAvgTwo = 0;
    	
    	for (int i = 0; i < doubOne.length; i++) {
    		doubAvgOne+= doubOne[i];
    	}
    	double avgNumOne = doubAvgOne / doubOne.length;
    	for (int i = 0; i <doubTwo.length; i++) {
    		doubAvgTwo += doubTwo[i];	
    	}
    	double avgNumTwo = doubAvgTwo / doubTwo.length;
    	
    	
    	if (avgNumOne >avgNumTwo) {
    		return true;
    	}else {
    		return false;
    	}

    }
    // Problem 12
    static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }
	// Problem 13
        /**
         * This method calculates the sum of all even numbers up to a given non-negative integer.
         * It returns 0 if the input is negative.
         * 
         * @param n the non-negative integer up to which the sum of even numbers is calculated
         * @return the sum of all even numbers up to the input integer, or 0 if input is negative
         */
        public int sumOfEvenNumbers(int n) {
            if (n < 0) {
                return 0; // Return 0 for negative input
            }

            int sum = 0;
            for (int i = 0; i <= n; i += 2) {
                sum += i; // Add even numbers to the sum
            }
            return sum;

	}

}

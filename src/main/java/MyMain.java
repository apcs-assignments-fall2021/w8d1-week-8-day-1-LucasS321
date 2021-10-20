import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
        // YOUR CODE HERE FOR WARMUP
        return (int) (Math.random() * 11+10);
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {
        // YOUR CODE HERE FOR WARMUP
        int num1 = randomTeen();
        int num2 = randomTeen();
        int num3 = randomTeen();
        System.out.println("The three random numbers are "+num1+", "+num2+", and "+num3);
        System.out.println("The largest number is "+Math.max(Math.max(num1,num2),num3));
        System.out.println("The smallest number is "+Math.min(Math.min(num1,num2),num3));
         // Uncomment this code later!
         System.out.println("Mathey max tests");
         System.out.println(Mathey.max(1, 2)); // 2
         System.out.println(Mathey.max(2, 1)); // 2
        System.out.println(Mathey.max(1.4, 2.6)); // 2.6
        System.out.println(Mathey.max(2.6, 1.4)); // 2.6
        System.out.println(Mathey.max(1, 2,3)); // 3
        System.out.println(Mathey.max(2, 1,3)); // 3
        System.out.println(Mathey.max(1.3, 2.9,3.3,4.7)); // 4.7
        System.out.println(Mathey.max(4.7, 3.3,2.9,1.3)); // 4.7
        System.out.println("Mathey random int tests");
        System.out.println(Mathey.randomIntager(1,8)); // 1-8
        System.out.println(Mathey.randomIntager(16)); // 0-16
        System.out.println("Mathey pow tests");
        System.out.println(Mathey.pow(2, 4)); // 16
        System.out.println(Mathey.pow(3, 3)); // 27
        System.out.println("Mathey.abs tests");
        System.out.println(Mathey.abs(6)); // 6
        System.out.println(Mathey.abs(-6)); // 6
        System.out.println("Mathey round tests");
        System.out.println(Mathey.round(4.1)); // 4
        System.out.println(Mathey.round(4.5)); // 5
        System.out.println("Mathey floor tests");
        System.out.println(Mathey.floor(2.6)); // 2
        System.out.println(Mathey.floor(3.5)); // 3
        System.out.println("Mathey ceil tests");
        System.out.println(Mathey.ceil(2.6)); // 3
        System.out.println(Mathey.ceil(3.5)); // 4
        System.out.println("Mathey sqrt tests");
        System.out.println(Mathey.sqrt(50)); // 7.07...
        System.out.println(Mathey.sqrt(35)); // 5.91...
        System.out.println("Pythag Test");
        System.out.println(Mathey.sqrt(Mathey.pow(5,2)+Mathey.pow(12,2)));
    }

}



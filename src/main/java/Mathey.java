public class Mathey {
    /* Write your own version of the Math.max method
     * Your method should be called max
     * This method should take **two integers** and return the larger integer
     * Ex. max(1, 2) => 2

     * You will need to practice writing the method signature below!
     * public static ...
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
public static int max(int in1, int in2) {
    if (in1 > in2) {
        return in1;
    } else {
        return in2;
    }
}



    /* Write another method called max that takes **two doubles**
     * Ex. max(1.2, 4.0) => 4.0
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED

public static double max(double in1, double in2) {
    if (in1 > in2) {
        return in1;
    } else {
        return in2;
    }
}


    /* Write another method called max that takes **three integers**
     * Ex. max(1, 4, 2) => 4
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED

    public static int max(int in1, int in2,int in3) {
        if (in1 > in2 && in1 > in3) {
            return in1;
        } else if (in2 > in1 && in2 > in3) {
            return in2;
        } else {
            return in3;
        }
    }


    /* Write another method called max that takes **four doubles**
     * Ex. max(1.0, 4.25, 1.3, 2.1) => 4.25
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED

    public static double max(double in1, double in2,double in3,double in4) {
        if (in1 > in2 && in1 > in3 && in1 > in4) {
            return in1;
        } else if (in2 > in1 && in2 > in3 && in2 > in4) {
            return in2;
        } else if (in3 > in1 && in3 > in2 && in3 > in4) {
            return in3;
        } else {
            return in4;
        }
    }


    /* Write a method that takes **two integers** and generates a random
     * integer between the first integer and the second integer, inclusive
     * you may assume that the first integer is smaller than the second
     * You may use Math.random() here, but you can't use any other Math methods!
     * Ex. randomInteger(1, 4) => 3
     *     randomInteger(1, 4) => 2
     *     randomInteger(1, 4) => 4
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
public static int randomIntager(int in1, int in2) {
    return (int) (Math.random() * (in2-in1+1) + in1);
}



    /* Write a method that takes **one integer** and generates a random
     * integer between 0 and the integer, inclusive
     * you may assume that the integer is greater than 0
     * Ex. randomInteger(5) => 3
     *     randomInteger(5) => 5
     *     randomInteger(5) => 0
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED

    public static int randomIntager(int in1) {
        return (int) (Math.random() * (in1+1));
    }





    // YOU MAY WORK ON THE FOLLOWING METHODS IF YOU FINISH EARLY

    /* Write a method that takes **two integers** and calculates the exponent
     * that you get by raising the first integer to the second integer
     * you may assume that both integers are positive
     * Ex. pow(2, 5) => 32
     *     pow(3, 4) => 81
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
public static int pow (int in1, int in2){
    int ans = in1;
    if (in1 >= 2) {
        for (int i = 2; i <= in2; i++) {
            ans = ans * in1;
        }
    }
    return ans;
}



    /* Write a method that takes **one integer** and returns the
     * absolute value of that integer
     * Ex. abs(2) => 2
     *     abs(-2) => 2
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED

    public static int abs (int in1){
        if (in1 < 0) {
            return 0-in1;
        } else {
            return in1;
        }
    }


    /* Write a method that takes **one double** and returns the
     * integer value that you get by rounding that double
     * You may assume that the integer is positive
     * Ex. round(2.4) => 2
     *     round(2.5) => 2
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
public static int round(double in1) {
    return (int) (in1+0.5);
}




    /* Write a method that takes **one double** and returns the
     * floor of that value
     * The floor is defined as the **largest** integer that is **less than**
     * or equal to some value
     * You may assume that the integer is positive
     * Ex. floor(2.4) => 2
     *     floor(2.999999999999) => 2
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED

public static int floor(double x) {
    return (int) x;
}



    /* Write a method that takes **one double** and returns the
     * ceiling of that value
     * The ceiling is defined as the **smallest** integer that is **greater than**
     * or equal to some value
     * You may assume that the integer is positive
     * Ex. ceil(2.99999) => 3
     *     ceil(3.01) => 4
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED

public static int ceil(double in1) {
    return ((int) in1) +1;
}



    /* Calculates the square root iteratively, using the Babylonian method
     * This method has been provided for you
     */
    public static double sqrt(double x) {
        double x1 = 5;
        double prev = 0;

        while (Math.abs(prev - x1) > 0.0001) {
            prev = x1;
            x1 = (x1 + x/x1) / 2;
        }

        return x1;
    }
}
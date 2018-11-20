package kyu8;
/*
Kata: Beginner Series #4 Cockroach
Task: The cockroach is one of the fastest insects.
Write a function which takes its speed in km per hour and returns it in cm per second, rounded down to the integer (= floored).

For example:

cockroachSpeed(1.08) == 30
Note! The input is a Real number (actual type is language dependent) and is >= 0.
The result should be an Integer.
 */
public class Kata056 {
    public int cockroachSpeed(double x){
        // Good Luck!
        return (int)Math.floor(100000*x/3600);
    }
}

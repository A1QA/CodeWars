package kyu8;
/*
Kata: Age Range Compatibility Equation
Task: Everybody knows the classic "half your age plus seven" dating rule that a lot of people follow (including myself).
It's the 'recommended' age range in which to date someone.
(Age/2)+7=min
(Age-7)*2=Max
minimum age <= your age <= maximum age

#Task

Given an integer (1 <= n <= 100) representing a person's age, return their minimum and maximum age range.
This equation doesn't work when the age <= 14, so use this equation instead:
min = age - 0.10 * age
max = age + 0.10 * age
You should floor all your answers so that an integer is given instead of a float (which doesn't represent age).
Return your answer in the form [min]-[max]

##Examples:

age = 27   =>   20-40
age = 5    =>   4-5
age = 17   =>   15-20
 */

public class Kata097 {
    public static String datingRange(int age) {
        return age > 14
                ? (age / 2 + 7) + "-" + ((age - 7) * 2)
                : (int) (0.90 * age) + "-" + (int) (1.10 * age);
    }
}

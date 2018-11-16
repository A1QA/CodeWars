package kyu8;
/*
Kata:Switch it Up!
Task: When provided with a number between 0-9, return it in words.

Input :: 1

Output :: "One".

Try using "Switch" statements.

 */
public class Kata050 {
    public static String switchItUp(int number)
    {
        switch (number){
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
        }
        return "Zero";
    }
}

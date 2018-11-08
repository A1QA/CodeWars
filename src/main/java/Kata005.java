/*
Kata: String Merge!
Task:
Given two words and a letter, return a single word that's a combination of both words,
merged at the point where the given letter first appears in each word.
The returned word should have the beginning of the first word and the ending of the second,
with the dividing letter in the middle. You can assume both words will contain the dividing letter.

Examples
stringMerge("hello", "world", "l")      ==>  "held"
stringMerge("coding", "anywhere", "n")  ==>  "codinywhere"
stringMerge("jason", "samson", "s")     ==>  "jasamson"
stringMerge("wonderful", "people", "e") ==>  "wondeople"
 */
public class Kata005 {
    public static String stringMerge(String s1, String s2, char letter) {
        //write your adorable code here
        return s1.substring(0,s1.indexOf(letter))+s2.substring(s2.indexOf(letter));
    }

    public static void main(String[] args) {
        stringMerge("hello", "world", 'l');
        stringMerge("jason", "samson", 's');
        stringMerge("wonderful", "people", 'e');
    }
}
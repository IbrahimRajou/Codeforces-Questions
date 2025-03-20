import java.util.Scanner;

public class WayToLongWords {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    /*
      You are given a word, if its length exceeds 10 you have to output its abbreviation.
      The abbreviation of a word is we write down the first and the last letter of a word 
      and between them we write the number of letters between the first and the last letters.

      Example:
      Input:                                            Output:
      3                                                 word
      word                                              s11n
      specification                                     p43s
      pneumonoultramicroscopicsilicovolcanoconiosis
    */

    int testCases = input.nextInt();
    input.nextLine();

    String results [] = new String [testCases];

    for (int i = 0; i < testCases; i++) {
      String word = input.nextLine();
      if (word.length() > 10){
        results[i] = word.charAt(0) + "" + (word.length() - 2) + word.charAt(word.length() - 1);
      }
      else{
        results[i] = word;
      }
    }

    for (int i = 0; i < results.length; i++) {
      System.out.println(results[i]);
    }
  }
}

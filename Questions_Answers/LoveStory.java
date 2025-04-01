import java.util.Scanner;

public class LoveStory {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    /*
      Problem: 1829A Love Story
      
      The first line of input contains the number of test cases, in each test case
      you must output the number of different characters between the given word
      and the word codeforces. (The given word is always 10 characters)
      
      Example:
      Input:                            Output:
      2 --> test cases
      collforcse                        4
      codeforces                        0
    */
    
    int testCases = input.nextInt();
    input.nextLine();
    
    String oriWord = "codeforces";
    
    int [] results = new int [testCases];
    
    int diff = 0;
    for (int i = 0; i < testCases; i++) {
      String word = input.nextLine();
      for (int j = 0; j < word.length(); j++) {
        if (word.charAt(j) != oriWord.charAt(j)){
          diff++;
        }
      }
      results[i] = diff;
      diff = 0;
    }
    
    for (int i = 0; i < results.length; i++) {
      System.out.println(results[i]);
    }
    
    input.close();
  }
}

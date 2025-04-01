
import java.util.Scanner;

public class CodeforcesChecking {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    /*
      The first line of input contains the number of test cases, print YES if the given 
      lowercasae character exists in the word codeforces, otherwise print NO;
      
      Example:
      Input:                            Output:
      5 ---> test cases
      c                                 YES
      i                                 No
      o                                 YES
      d                                 YES
      n                                 NO
    */ 
    int testCases = input.nextInt();
    input.nextLine();
    String results [] = new String [testCases];
    for (int i = 0; i < testCases; i++) {
      char c = input.nextLine().charAt(0);
      if("codeforces".contains(c + "")){
        results[i] = "YES";
      }
      else{
        results[i] = "NO";
      }
    }
    input.close();
    for (String i : results){
      System.out.println(i);
    }
  }
}

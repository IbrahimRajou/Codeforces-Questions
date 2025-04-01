import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    /*
      You are given there numbers a,b and c where (0 <= a,b,c <= 20)
      print Yes if the addition of two numbers gives the third, otherwise print No.

      Example:
      Input:                       Output:
      3 -> testCases
      4 3 1                        Yes
      20 12 2                      No
      9 18 9                       Yes
    */

    int testCases = input.nextInt();
    input.nextLine();

    String results [] = new String [testCases];

    int k = 0;

    for (int i = 0; i < testCases; i++) {
      String equation = input.nextLine();
      int space1 = equation.indexOf(" ");
      int space2 = equation.indexOf(" ", space1+1);
      int a = Integer.parseInt(equation.substring(0, space1));
      int b = Integer.parseInt(equation.substring(space1 + 1, space2));
      int c = Integer.parseInt(equation.substring(space2 + 1));
      if(a + b == c || a + c == b || b + c == a){
        results[k] = "YES";
      }
      else{
        results[k] = "NO";
      }
      k++;
    }

    for (String i : results){
      System.out.println(i);
    }
    
    input.close();
  }
}

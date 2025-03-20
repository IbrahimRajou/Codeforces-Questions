import java.util.Scanner;

public class PlusOrMinus {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    /*
      You are given three integers a, b and c
      such that exactly one of these two equations is true:
      a + b = c
      a − b = c
      Output + if the first equation is true, and - otherwise.
      
      Example:
      Input:                            Output:
      3 -> TestCases
      3 -3 0                            +
      -1 -5 4                           -
      15 3 18                           +
    */
    int testNum = input.nextInt();
    input.nextLine();

    char symbols [] = new char [testNum];

    int k = 0;
    for (int i = 0; i < testNum; i++) {
      String equation = input.nextLine();
      int space1 = equation.indexOf(" ");
      int space2 = equation.indexOf(" ", space1+1);
      int a = Integer.parseInt(equation.substring(0,space1));
      int b = Integer.parseInt(equation.substring(space1+1, space2));
      int c = Integer.parseInt(equation.substring(space2+1));
      if (a + b == c){
        symbols[k] = '+';
      }
      else{
        symbols[k] = '-';
      }
      k++;
    }
    for (int i = 0; i < symbols.length; i++) {
      System.out.println(symbols[i]);
    }
    
  }
}

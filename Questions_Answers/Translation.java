import java.util.Scanner;

public class Translation{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    /*
      You are given two strings, print Yes if the second word is the reversed 
      of the first.

      Example:
      Input:       Output:
      Hello         Yes
      olleH
    */

    String s, t, revWord;
    s = input.nextLine();
    t = input.nextLine();
    revWord = "";

    for(int i = s.length() - 1; i >= 0; i--){
      revWord += s.charAt(i);
    }

    if(revWord.equals(t)){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
    input.close();
  }
}
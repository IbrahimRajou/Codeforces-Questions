import java.util.Scanner;

public class WordCapitalization {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    

    /*
      You are given a word,your task to capitalize the given word.
      Capitalization is writting a word with its first letter as uppercase.
      Note that during capitalization all the letters except the first one remains unchanged.
      
      Example:
      Input:            Output:
      apPlE             ApPlE
    */
    String oriWord = input.nextLine();
    String newWord = "";

    for (int i = 0; i < oriWord.length(); i++) {
      if(i == 0){
        newWord = newWord + oriWord.toUpperCase().charAt(0);
      }
      else{
        newWord += oriWord.charAt(i);
      }
    }

    System.out.println(newWord);

    /*
    OTHER CORRECT SOLUTION
    String word = input.nextLine();
    word = word.substring(0,1).toUpperCase() + word.substring(1);
    System.out.println(word);
    */
  }
}

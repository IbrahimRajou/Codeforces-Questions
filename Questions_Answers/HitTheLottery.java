
import java.util.Scanner;

public class HitTheLottery {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    /*
      The input is the amount of dollars Allen wants to withdraw from his bank account, 
      help him to find the minimum number of bills he could receive after withdrawing. 
      The denominations for dollar bills are 1, 5, 10, 20, 100.

      Example:
      Input:            Output:
      125               3
      Input:            Output:
      295               8
      Input:            Output:
      1000000000        10000000

      Explanation:
      125$ are 100$ + 20$ + 5$ => these are the minimum number of bills he could have.
      125$ are also 100$ + 10$ + 10$ + 5$ => that answer is true BUT NOT THE MINIMUM NUMBER OF BILLS.
    */
    int amount = input.nextInt();
    input.close();

    int bills = 0;

    int denominations [] = {100, 20, 10, 5, 1};
    int i = 0;
    while (amount != 0){
      bills += amount / denominations[i];
      amount = amount % denominations[i];
      i++;
      /*
      OTHER VALID SOLUTION (more detailed):
      bills = amount / 100;
      amount = amount % 100;
      bills += amount / 20;
      amount = amount % 20;
      bills += amount / 10;
      amount = amount % 10;
      bills += amount / 5;
      amount = amount % 5;
      bills += amount / 1;
      amount = amount % 1;
      */
    }
    System.out.println(bills);
  }
}

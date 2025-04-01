
import java.util.Scanner;

public class SoldierAndBananas {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    /*
      Your are given k, n and w 
      k represents the cost of the first banana
      n represents the dollars the soldier has
      w represents the number of bananas the soldier wants to buy
      
      the cost of the first banana is k
      the cost of the second banana is 2 * k
      the cost of the second banana is 3 * k   and so on...
      
      Print the number of dollars the soldier must borrow from his friend 
      to buy the bananas 
      
      Example: 
      Input:                      Output:
      5 20 4                      30
      
      Explanation::
      1st banana costs 5$
      2st banana costs 2 * 5$
      3st banana costs 3 * 5$
      4st banana costs 4 * 5$
      total = 50
      he needs to borrow = 50 - 20
      
    */
    String data = input.nextLine();
    int k, n, w, cost = 0;
    int space1 = data.indexOf(" ");
    int space2 = data.indexOf(" ", space1 + 1);
    k = Integer.parseInt(data.substring(0,space1));
    n = Integer.parseInt(data.substring(space1 + 1,space2));
    w = Integer.parseInt(data.substring(space2 + 1));
    for (int i = 1; i <= w; i++) {
      cost = cost + i*k;
    }
    if(n >= cost){
      System.out.println(0);
    }
    else{
      System.out.println(cost-n);
    }
    input.close();
  }
}

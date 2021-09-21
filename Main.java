
/*
Lab 4
Andy Chen
Date: 9/21/21
*/
//import Classes
import java.util.*;

class Main {
  public static void main(String[] args) throws InterruptedException {
    Random r = new Random();
    int randomNum = r.nextInt(50) + 1;
    int countRandomNum = 0;
    System.out.println("The Random number is: " + randomNum);
    for (System.out.println("Counting Down:"), countRandomNum = randomNum; -1 != countRandomNum; countRandomNum--) {
      System.out.println(countRandomNum);
      Thread.sleep(150);
    }
    if (randomNum <= 5) {
      System.out.println("Ahoy matyes!");
    } else if (randomNum > 25 & randomNum < 42) {
      System.out.println("Cannonball!");
    } else {
      System.out.println("Blast off!");
    }
  }
}
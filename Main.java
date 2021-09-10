import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a number to count down or up from:");

    String strCountNum = s.nextLine();
    int countNum = Integer.parseInt(strCountNum);

    System.out.println("----------------------------------");

    if (countNum > 0){
      while(countNum > 0){
        System.out.println(countNum);
        countNum--;
      }
    } else if (countNum < 0) {
        while (countNum < 0) {
          System.out.println(countNum);
          countNum++;    
        }
    }
    System.out.println(countNum);
    System.out.println("Blast Off!");

  }
}
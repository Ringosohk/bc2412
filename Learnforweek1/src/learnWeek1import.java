import java.util.Scanner;

public class learnWeek1import {
  public static void main(String[] args) {
      
    //Scanner scanner = new Scanner(system.in);
    //String word = Scanner.nextline();
    //int number = scanner.nextln();
    //float number = scanner.nextfloat();
    //System.out.println(word);

    
  // Scanner scanner = new Scanner(System.in);
  // int price = scanner.nextInt();
  // if (price >20){
  //   System.out.println("dont'buy");
  // } else {
  //   System.out.println("buy it!");
  // }




  Scanner scanner = new Scanner(System.in);
 String string = scanner.nextLine();
  if (string.equals("scissors"))
  {
    System.out.println("stone");
  }
  else
  {
    if(string.equals("paper"))
  {
    System.out.println("scissors");
  }
  else {
System.out.println("paper");
  }  

  }
 }
}

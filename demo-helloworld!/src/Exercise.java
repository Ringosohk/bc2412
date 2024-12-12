public class Exercise {

public static void main (String[]args){
  double priceForApple = 7.3;
  double priceForOrange = 6.5;
  int quantityOfApple = 3;
  int quantityOfOrange = 4;

  double totalprice = priceForApple * quantityOfApple + priceForOrange * quantityOfOrange;

  System.out.println(totalprice);//47.9


  int mathScore = 73;
  int englishScore = 68;
  int historyScore = 61;

  int averageScore = (mathScore + englishScore +historyScore)/3;

  System.out.println(averageScore);//67


  // byte-> short-> int-> long
  byte maxByte = 127;

  // int value -> byte;
  //maxByte = maxByte +1 ;// jave is it safe? Not safe
  //maxByte = maxByte -1 ;// jave is it safe? Not safe

  maxByte = (byte) (maxByte +1) ;// jave is it safe? Not safe
  maxByte = (byte) (maxByte -2) ;// jave is it safe? Not safe
  // byte value+ int value -> value
  //can we assign int value to byte variable? (downcasting)

  System.out.println(maxByte);// 125 / -127,overflow

  int x = maxByte;// Java is it safe? it is safe
  

  System.out.println(maxByte+1);

  // ! java: (1) Compile time + Run time
  // (1) java file (.java) -> class file (.class): java code -> byte code (~machine)
  // (1.1) compile fail. for example (missing; -> syntax error)
  //(1.2) compile success -> class file
  // (2) Java Virtual Machine (JVM)-> convert class file to machine code -> execute machine code


}
}
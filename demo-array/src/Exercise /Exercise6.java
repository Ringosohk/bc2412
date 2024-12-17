public class Exercise6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  public static void main(String[] args) {
    int lastLastNum = 0,lastNum = 1,num = 0;
    int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence

System.out.print(lastLastNum+" ");
for(int i=0;i<14;i++){
    lastLastNum=lastNum;
    lastNum=num;
    num+= lastLastNum;
    System.out.print(num+" ");
}


  }
}
/**
 * The sum is 55
 */
public class Exercise7 {
  // Sum values of an array
  public static void main(String[] args) {
    // Declare a int array, with value 1 to 10
    // code here

    int sum = 0;
    int[]intArr = new int [11];
    for(int i=0; i<intArr.length;i++){
      intArr[i]=i;
      sum+= i;
    }

    // Write a loop to sum up all value in the int array
    // code here ...
    System.out.println("The sum is " + sum);
  }
}
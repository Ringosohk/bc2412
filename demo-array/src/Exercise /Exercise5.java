public class Exercise5 {
/**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    // if not found, print "Not Found."
    // code here ...

    int index = 0;

  for (int i = 0; i < str.length();i++){
    if(str.charAt(i)==target){
      index= i;
    }
  }
   System.out.println(index);
  }
}
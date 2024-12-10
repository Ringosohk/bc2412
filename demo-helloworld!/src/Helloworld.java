public class Helloworld {
public static void main(String[] args) {


    //Comment.Welcome to bootcamp! @(*!@(#)!@)
    //1.Data Type (primitive)
    //int (datwtype)-> variable
    //x,dayOWeek -> varable
    int x =3;//form right to left
    int dayOWeek = 7;
    // int y = 3.2;//!not OK,! is a vairable that can store integer only.

    double y2=3.2;
//double 2w = 10.0-;//! not ok

    //variable naming conversion
    //caml case:dayOWeek; y2

    //Re-assignment
    x = 101;// re-assign 101 to x
    x = x + 10;//right 101+10, left, assign 111 to x
    x = x - 40;// 111 - 40 -> 71
    x = x * 3;// 71 * 3 -> 213
    x = x / 213; // 213/213

   //print out
   System.out.println (x); //1

   x = x + 8 * 2 / 4 + 1; //
   // 8 * 2 /4 -> 4
   // 1 + 4 + 1
   //

   System.out.println (x);//

   x = x + 8 * 2 / 4 + 1;//

   System.out.println (x);

   x = (x+2) * 2 /(3+1);

   System.out.println (x);

   x = (x+3)/(6+1) * (x+1);

   System.out.println (x);

}
}



    // divide 
    // int x2 = 3 / 2;
    //step 1: 3 -> int value, 2 ->  int value
    //step 2: int value / int value -> int value
    //step 3: 3/2 -> 1
    //step 4: assign 1 (int value) to int type variable (OK!)

    System.out.println (x2);// 1

    double x3 = 3 / 2;
    //Step 1: 3 -> int value, 2 -> int value
    //Step 2: int value / int value ->  int value
    //Step 3: 3/2 -> 1
    //Step 4: assign 1 (int value) to double type variable (convert 1 to 1.0)
    System.out.println (x3); // 1.0

    double x4 = 3.0 / 2;
    //Step 1: 3 -> int value, 2 -> int value
    //Step 2: double value / int value ->  double value
    //Step 3: 3.0 / 2.0 -> 1.5
    //Step 4: assign 1.5 (int value) to double type variable (convert 1 to 1.0)
    System.out.println (x4); // 1.5


    //divide by 0
    int f =10/0; //!error
    system.out.println(f)

    //0/10
    System.out.println (0/10); // 0

    int x5 = 3.0
    //Step 1: 3.0 -> double value, 2 -> int value
    //Step 2: double value / int value ->  double value
    //Step 3: 3.0 / 2.0 -> 1.5
    //Step 4: assign 1.5 (double value) to int typ e variable(downcasting)
    // ! Not allow assign a higher level value to a lower level type of variable

    //int -> double (upcast)
    // double -> int (downcast)
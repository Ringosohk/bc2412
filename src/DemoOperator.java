public class DemoOperator {
  public static void main(String[]args){
    //+1
    int x = 3 ;
    x = x + 1;
    x++;
    ++x;
    x+=1; // += means x = x+1
    System.out.println(x);//7

    //-1
    int y = 10;
    y= y- 1;
    y--;
    --y;
    y-=1;
    System.out.println(y);//6

    //+2
    int b = 20;
    b=b+2;
    b+=2;
    System.out.println(b);//24

    //-2
    int c = 100;
    c=c-2;
    c-=2; // c = c -2
    System.out.println(c);//96

    //*=,/=
    int m =5;
    m=m*2;
    m*=2;
    System.out.println(m);//20

    int u =4;
    u =u/2;
    u/=2;
    System.out.println(u);//1

    int remainder = 10%3;
    System.out.println(remainder);//1

    //++x vs x++\int a = 8;
    int a = 8;
    int result1 = ++a +3;
    System.out.println(result1);//12
    System.out.println(a);//9
    //Step 1: a become 9
    //Step 2: a+3 (9+3)
    //Step 3: assign 12 to result 1


    int q=8;
    int result2 = q++ +3;
    System.out.println(result2);//11
    System.out.println(a);//9
    //Step 1:q+3 (8+3)
    //Step 2:assign 11 to result 2
    //Step 3:q become 9

    int p=8;
    int result3 = p++ +3+4;
    System.out.println(result3);
    System.out.println(p);//15

    int o=8;
    int result4 = o++ +3;
    int result4 = o;
    System.out.println(result4);//9
 
    int h=2;
    int result5 = h++ +3;
    h = h+1;
    System.out.println(result5);//5
    System.out.println(h);//4

    //string +=
    String s="hello";
    s+="!";
    System.out.println(s);//hello!
    //int +double ->double
    //String + anthying -> String

    s +=1;
    System.out.println(s);//hello!1

    s+= true;
    System.out.println(s);//hello!1ture

    int x10 =5;
    int y10 =10;
    int z10 =x10 += 3*y10;
    System.out.println(z10);// 35 =3*10+5

    int x11 =3;
    int y11 = (x11++ +3) * x11++;
    System.out.println(y11);//24
    System.out.println(x11);//5
    //step 1: 3+3
    //step 2: x11 become 4
   //step 3: 6*4
   //step 4  x11 become 5

   int a11 =3;
   int b11 = (a11++ +3)* ++a11;
   System.out.println(b11);//30
   System.out.println(a11);//
   //step 1: 3+3=6
   //step 2: x11 = 3+1=4    
   //step 3: 4+11
   //step 4: x11 = 1+4 = 5
   //step 5: 5*6 = 30
   



  }
  
}

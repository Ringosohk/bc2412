public class DemoSwitch {
  public static void main (String[]args){
    int x =3;
    if (x == 1){
      System.out.println("x=1");
    } else if ( x == 2){
      System.out.println("x=2");
    } else if ( x == 3){ 
      System.out.println("x=3");// print
    } else{
      System.out.println("something.else...");
    }

// switch
    switch (x){ // checking x == ? only
      case 1:
      System.out.println("x=1");
      break;
      case 2:
      System.out.println("x=2");
      break;
      case 3:
      System.out.println("x=3");
      break;
      default:
      System.out.println("something.else...");
    }

    char gender = 'M'; // F,M (Well defined value range)
    switch (gender){
      case 'M';
      System.out.println("Male");
      break;
      case 'F';
      System.out.println("Female");
      break;
      default;
      System.out.println("unknown");
    }

    //Counting
    String s  = "hello";
    // count the number of 'l'
    // for + if 
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'l') {
        count++;
      }
  }
  System.out.println(count);//l

  //continue - skip the rest, to to next iteration
  count = 0;
  for (int i =0;i < s.length();i++) {
    if (s.charAt(i) == 'l') {
    continue;
    // skip count++, go to i++
  }
  count++;
}
  System.out.println(count);//l


  // 1 -100, print all numnbers, which can be dividend by 3 & 4
  for (int i = 1; i <= 100; i++) {
    if (1 % 3 == 0 && 1 % 4 != 0 //event 1
    ||1 % 4 == 0 && 1 % 3 != 0 // event 2
    ||1 % 3 == 0 && 1 % 4 != 0 // event 3
    ||i % 3 == 0 && i % 4 == 0 // event 4
    ) {
      continue;//skip print
    }
    System.out.println(i);

      // 10 things..
      
  }

    }

  }

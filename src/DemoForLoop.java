public class DemoForLoop {
  public static void main (String[]args){

    //2^100
    int x =2;
    x = x * 2;
    x*=2;
    System.out.println(x);

    //for (; ;){
    // }

    //"i<3" continue ceitieria
    //"i++" ->modifier
    //! you have to let the modifier work with "continue criteria", 
    //!so that continue at the end become flase
    
    
    //For Loop
    for(int i =0; i < 3; i++){ // 3-0 (0,1,2)
      System.out.println("hello");
    }
    //step 1: int 1 = 0;
    //step 2: i < 3 (question) -> true
    //step 3; if true,print hello
    //step 4: i++,i become 1
    //step 5: i < 3 (question)->true
    //step 6: if true,print hello
    //step 7: i++, i become 2
    //step 8: i < 3 (question) ->true
    //step 9: if true,print hello
    //step 10: i++, i become 3
    //step 11: i < 3 (question -> flase)
    //step 12: exit for loop

    for (int i =0; i < 5; i++){ // 0,1,2,3,4
      System.out.println(1);
    }

    //print even numbers (i % 2 == 0)
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) { //even number definition
        System.out.println(i);
      }
    }
 
    //print 0 - 100, dividend by 3 and dividend by 4
    // for + if 
    for (int i = 0; i < 101;i++){
      if(i % 3 == 0 && i % 4 == 0){
        System.out.println(i);
      }
    }

    // sum up 0-20; 0+1+2...+20
    int sum = 0;
    for (int i = 0; i<=20;++i){ //i=1+i ; i--
      sum = sum + i;
    }
    System.out.println(sum);//210
    //System.out.println(1);//! i is declared within the for loop

    
    //sumup all odd number between 0-10
    //sumup all even numbers between 0-10
    // ! find the different between evenSumnqne oddSum -> positive number
    sum = 0;
    for (int i =0; i<11;i++){
      if (i%2 == 1){
        sum +=i;
      }
    }
    System.out.println(sum);//25

        //sumup all odd number between 0-10
    //sumup all even numbers between 0-10
    // ! find the different between evenSumnqne oddSum -> positive number
    int oddSum =0;
    int evenSum=0;
    for (int i =0;i<11;i++){
      if (i%2 == 1){
        oddSum+=i;
      }else {
        evenSum +=i;
      }
      }
      //int diff = -1;
      //if (oddSum > evenSum){
      //..diff = oddSum-evenSum;
      //}else{
      //..diff=evenSum-oddSum;
    //}
    int diff = oddSum>evenSum? oddSum -evenSum: evenSum-oddSum;
    System.out.println(diff);//5


    //Searching
    String str = "abcdefijk";

    //1.Check if 'd' exists in the string.
    //for loop + if + charAt
    boolean found = false;
    for (int i = 0; i< str.length();i++){
      if(str.charAt(i) == 'd'){
        found = true;
        break;// break the nearest loop
      }
      }
      System.out.println(found);

      //Test Case:
      //1."abcdefijk"
      //2."abcdefijk"
      //3.""
      //4."abcdefijkd"

      //2. check if the string value contains given sub-string
      String substr = "ll";
      String str2 = "hello";
      //for loop + substring
      boolean isSubstringExist = false;
      for (int i = 0; i<str2.length();i++){
        if (str2.substring(i,i+substr.length()).equals(substr)){
          isSubstringExist = true;
          break;
        }
      }
      System.out.println(isSubstringExist);//true
      


     //3. check if the string value contains given sub-string
     String substt = "loq";
     String str3 = "hello";
     //hel vs loq
     //ell vs loq
     //llo vs loq

      //for loop + substring
      boolean isSubExist = false;
      for (int i = 0; i<str3.length()-substt.length()+1;i++){
        if (str2.substring(i,i+substt.length()).equals(substt)){
          isSubstringExist = true;
                     break;
                  }
              }
            System.out.println(isSubExist);//false
      
      //Nested Loop
      for (int i =0; 1 < 3; i++ ){
        for (int j = 0; j < 4; j++ ) {
          System.out.println("*");// print and next time
          System.out.print("*");// print
        }
        //go to i++
      }
      //! step 1: i=0,j=0,print  *
      //step 2: i=0,j=1,print *
      //step 3: i=0,j=2,print *
      //!step 4: i=0,j=3,print  *
      //Step 5: i=1, j=0,print*
      //Step 6: i=1, j=1,print*
      //Step 7: i=1, j=2,print*
      //Step 8: i=1, j=3,print*
      //! Step 9: i=2, j=0,print *
      //Step 10: i=2, j=1,print *
      //Step 11: i=2, j=2,print *
      //Step 12: i=2, j=3,print *
      

      //Nested Loop
      //*
      //**
      //***
      //****

      int n = 4;
      for (int i = 0; i < n; i++){ 
        for (int j = 0; j < i + 1; j++){
          System.out.print("*");
        }
        System.out.println("");
      }



          }

        }




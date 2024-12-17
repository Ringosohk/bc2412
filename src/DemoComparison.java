public class DemoComparison {
  public static void main (String[]args){
    //!>,<,>=,!=,==(ture or flase)
    //"=="->asking/check if they are equals
    //"="->assignment
    
    int age = 20;
    boolean isAdult = age >18;
    System.out.println(isAdult);//true
    
    double p1 = 3.14159;
    boolean isCorrect = p1 == 3.14159;
    System.out.println(isCorrect);//true
    
    char gender = 'F';
    boolean isMale =gender == 'M';
    System.out.println(isMale);//flase
    
    Float price = 10.2f;
    System.out.println(price == 10.2f);//flase
    System.out.println(price == 10.2f);//ture,during comparsion, convert price to double before comparison
    
    // ! operator (NOT)
    boolean result = isAdult;
    System.out.println(result);//flase
    
    if (age>=18) {
  //do something...
}
    
if (age>=18) { //age <18
    //do something...
      }

    if (!isAdult){
    //do something....
    }

    //&& AND
    int age2 =30;
    char gender2 = 'F';
    boolean result2 = age2 >= 30 && gender2 == 'M';
    //event 1; age 2 >=30->true
    //event 2: gener2 =='M' -> flase
    System.out.println(result2);//flase
    
    // || OR
    int age3 =30;
    char gender3 = 'F';
    boolean result3 = age3 >= 30 || gender3 == 'M';
    //event 1; age 2 >=30->true
    //event 2: gener2 =='M' -> flase
    System.out.println(result3);//ture
    
    //||OR (flase ||flase)->flase
    Boolean result4 = (age2 < 30||gender2 !='F');
    System.out.println(result4);//flase
    
    //AND OR (true AND (flase OR ture))
    boolean result5 = age 2>=30 && (gender2 =='M'||age2>18);
    System.out.println(result5);//TURE
    //Step 1 :gender 2 == 'M'||AGE2 >18)->flase||true->true
    //Step 2:age2>=30->true,&&true ->true

    //!The ordering of event checking is fidderent
    //AND go first
    boolean result6 =age2>18 || age 2 >= 30 && gender2=='M';
    //

}

}

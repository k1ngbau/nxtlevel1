import exercises.Mycollection;
import objects.Animal;
import objects.Customer;
import objects.Employee;
import objects.Person;

import java.util.ArrayList;
import java.util.List;

public class Main
 {

    public static void main(String[] args)
     {
        System.out.println("Hello World!");

        /*
          Multiple
          line
          comment
         */

        /**
         * This is a documentation Comment block
         * 2d line documentation Commend block
         * */

        //single line comment

        /*TODO Comment Block*/
        /*TODO task 1*/
        /*TODO task 2*/
        /*Primitive variables*/

        byte byteVariable= 127; //range from -128-127
        short mediumRangeDecimalVariable= 12345; //range from -32768 to 32767
        int decimalVariableUpTo= 12345677; //in java from -2147483648 to 214748364
        long largeDecimalVariableFrom=  -9223372036854775808L;
        long largeDecimalVariableTo=  223372036854775808L;
        float numberWithDecimalPlaces = 8.2f;
        double veryLargeNumberWithDecimalPlaces = 123456.12345;
        boolean isTrueorFalse= false;
        char singleCharacter= '\u0041'; // min \u0000 max \uffff

        long myLongVar= 1234L;
        int myInt= 1234;

        myLongVar = myInt;


        String someText = "This is a string variable";

         // System.out.println( mediumRangeDecimalVariable );

        //objects
        //Person
//         Person person=new Person();
//         person.setFirstName("First");
//         person.setLastName("Last");
//         String introduceYourself = person.introduceYourSelf();
//           String theFirstName= person.getFirstName();

//         System.out.println(theFirstName);

        //Person(Parameter)

//        Person person1=new Person("John" , "Cena" ,"Can't" , "See.me");

        // System.out.println(introduceYourself);

        //Employeee
         Employee employee= new Employee();
         employee.setFirstName("Hungry");
         employee.setLastName("Najud");
         employee.setDepartment("Yoyong's Catering");
         String introduceEmployee = employee.introduceYourSelf();

         System.out.println(introduceEmployee);

        /*TODO create an animal class class with 3 properties and getter and setters Data types: String, integer, boolean*/

        //Animal
        /**
          Animal animal=new Animal();
          animal.setAname("Dog");
          animal.setNumLegs( 4 );
          animal.setCanSwim(true);

          String aNimal= animal.tibon();

          System.out.println(aNimal);
         **/

        //Customer

         Customer customer = new Customer();
         customer.setFirstName("Chester");
         customer.setLastName("Bennington");

         String cIntro = customer.introduceYourSelf("Ferrari");


         System.out.println(cIntro);

        int x = 4;

        if( x > 0 )
            {
           System.out.println(" X have a value");
            }
        else
            {
           System.out.println("No value");
            }

        //WHILE LOOP

        int i = 1;

       /** while(i <= 6)
        {

           System.out.print("[" + i + "]");

           i++;
        }
        **/

       //SUM OF WHILE

        int sum=0;
        int loopN=1;

        while ( loopN <= 6)
        {
           sum+=loopN;

           loopN++;
        }

        System.out.println(sum);

/**
 *    //DO WHILE LOOP
        int z= 1;
        do
        {
           System.out.print("["+ z +"]");

           z++;
        }

        while( z <= 6 );
 **/

         //FOR LOOP

//        int l;
//        int m = 0 ;
//
//        for (l = 1 ; l <= 6 ; l++)
//        {
//           m += l;
//        }
//
//        System.out.println(m);
//
//


//        String[] myIntructor = {"Niel" , " Bert" , "Amille"};
//        int r;
//
//        for (r = 0 ; r <= 2 ; r++)
//        {
//           System.out.println( myIntructor[r] );
//        }

        String[] myIntructor = {"Niel" , "Bert" , "Amille"};
        int r;

//        for (r = 0 ; r <= 2 ; r++)
//        {
//           if (myIntructor[r] == "Bert")
//           {
//              myIntructor[r] = "Amante";
//           }
//           System.out.println( myIntructor[r]);
//
//        }
         Mycollection.myFriends();
         Mycollection.myGirlfriends();
         Mycollection.status();
         Mycollection.currentStatus();

     }


 }

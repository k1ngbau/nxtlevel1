package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public abstract class Person
 {

     private String firstName;
     private String lastName;
     private String userName;
     private String email;


     public void setFirstName(String firstname)
     {
         /*TODO check if string is from a-z*/

         this.firstName = firstname;
     }

     public String getFirstName()
     {
        return firstName;
     }

     public String getUserName()
     {
         return userName;
     }

     public void setUserName(String userName)
     {
         this.userName = userName;
     }

     public String getEmail()
     {
         return email;
     }

     public void setEmail(String email)
     {
         this.email = email;
     }

     public String getLastName()
     {
         return lastName;
     }

     public void setLastName(String lastName)
     {
         this.lastName = lastName;
     }

     public String introduceYourSelf()
     {
         return "Hi my name is " + firstName +" "+ lastName;
     }

     public Person()
     {

     }

     public Person(String firstName , String lastName , String userName , String email)
     {
         this.firstName = firstName;
         this.lastName = lastName;
         this.userName = userName;
         this.email = email;
     }
 }

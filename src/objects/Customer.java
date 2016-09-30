package objects;

/**
 * Created by jpmc on 9/29/2016.
 */
public class Customer extends Person
    {
        public String introduceYourSelf()
        {
            String firstName = getFirstName();
            String lastName = getLastName();

            return "Hi! I'm " + firstName +" "+ lastName +  " I want to buy Ferrari1!" ;
        }

        public String introduceYourSelf(String product)
            {
                String firstName = getFirstName();
                String lastName = getLastName();

                return "Hi! I'm " + firstName + " " + lastName +  " I want to buy " + product + "!";
            }

    }



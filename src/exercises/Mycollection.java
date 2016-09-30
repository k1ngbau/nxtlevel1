package exercises;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jpmc on 9/30/2016.
 */
public class Mycollection
    {

        public static String myFriends()
        {

            int ind;

             List<String> myFriends = new ArrayList<String>();

            myFriends.add("Bert");
            myFriends.add("Besh");
            myFriends.add("Bess");
            myFriends.add("Jeremiah");
            myFriends.add("Neil");


            Random friend= new Random();

            int current = friend.nextInt(4);

            return myFriends.get(current);


        }
        public static String myGirlfriends()
        {
            List<String> myGirlfriends = new ArrayList<String>();

            myGirlfriends.add("Angel Locsin");
            myGirlfriends.add("Alodia Gosiengfiao");
            myGirlfriends.add("Janela Salvador");
            myGirlfriends.add("Kendall Jenner");
            myGirlfriends.add("Liza Soberano");

            Random gfriend= new Random();

            int current = gfriend.nextInt(4);

            return myGirlfriends.get(current);
        }
        public static String status()
        {
            List<String> status = new ArrayList<String>();

            status.add("friendzoned");
            status.add("hates");
            status.add("loves");
            status.add("is in a complicated relationship with ");
            status.add("admired");

            Random relationship= new Random();

            int current = relationship.nextInt(4);

            return status.get(current);

//            int ind;
//            System.out.println(" ********My GIRLFRIENDS ARE*********");
//            for(ind= 0 ; ind < myGirlfriends.size() ; ind++)
//
//            {
//                System.out.println(myGirlfriends.get(ind));
//            }
        }
        public static void currentStatus()
        {

            String friend = myFriends();
            String status = status();
            String myGF = myGirlfriends();

            System.out.println(friend + " " + status +" "+ myGF + ".");

        }

    }


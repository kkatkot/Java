import java.util.ArrayList;
import java.util.Collections;

class Main{
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating an empty ArrayList of boattype
        ArrayList<Boat> ar = new ArrayList<Boat>();
 
        // Adding entries in above List
        // using add() method
        ar.add(new Boat("Mayank", 1990, 433, 500, 16000));
        ar.add(new Boat("Anshul", 1967, 3755, 600, 10000));
        ar.add(new Boat("Solanki", 2007, 9585, 2500, 6000));
        ar.add(new Boat("Aggarwal", 2020, 9784, 15000, 25000));
 
        System.out.println("Unsorted");
        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        //Sorting boats by year
        Collections.sort(ar, new SortByYear());

        System.out.println("\nSorted by year");
 
        //Print
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting boats entries by name
        Collections.sort(ar, new SortByName().reversed());

        System.out.println("\nSorted by name");
 
        // Print
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        
}}

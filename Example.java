import java.io.*;
import java.lang.*;
import java.util.*;


class platform {

    // Attributes of a student
    int fee;
    String name;

    // Constructor
    public platform(int rollno, String name)
    {

        // This keyword refers to current instance itself
        this.fee= rollno;
        this.name = name;

    }
    public String toString()
    {

        // Returning attributes of Student
        return this.fee+ " " + this.name + " ";

    }
}

// Class 2
// Helper class implementing Comparator interface



class Sortbyname implements Comparator<platform> {

    // Method
    // Sorting in ascending order of name
    public int compare(platform a,platform b)
    {

        return a.name.compareTo(b.name);
    }
}

// Class 4
// Main class
class Example{

    // Main driver method
    public static void main(String[] args)
    {


        ArrayList<platform> ar = new ArrayList<platform>();



        ar.add(new platform(1200,"Great Learning"));
        ar.add(new platform(1310,"Coursera"));



        System.out.println("Unsorted");

        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting student entries by roll number


        // Display message on console for better readability


        // Sorting student entries by name
        Collections.sort(ar, new Sortbyname());

        // Display message on console for better readability
        System.out.println("\nSorted by name");

        // // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}

package at.ac.fhkufstein;

import java.io.FileReader;

public class Aufgabe_5
{
    public static void main(String[] args)
    {

        /*
        * checked at Compile time --- NOT RuntimeException
         */
        FileReader file = new FileReader("C:\\myFile.dat"); //Comment for Compilation


        /*
        * Not checked at Compile Time ----- RuntimeException
         */
        String a = null;
        a.length();
        int test = 10/0;

    }
}

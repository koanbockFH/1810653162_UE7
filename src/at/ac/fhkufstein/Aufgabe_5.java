package at.ac.fhkufstein;

public class Aufgabe_5
{
    public static void main(String[] args) throws NumberFormatException
    {
        try
        {
            throw new NumberFormatException();
        }
        catch(NumberFormatException e)
        {
            //catched therefore checked Exception
        }

        int a = 10;
        int b = 0;

        int ergebnis = a/b; //Unchecked Exception Arithmetic

    }
}

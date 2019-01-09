package at.ac.fhkufstein;

public class UebungException extends Exception
{
    @Override
    public String getMessage()
    {
        return "Das ist meine Fehlermeldung!";
    }
}

package at.ac.fhkufstein;

public class UebungException extends Exception
{

    public UebungException()
    {
        super("Das ist meine Fehlermeldung!");
    }

    public UebungException(String customMessage)
    {
        super(customMessage);
    }
}

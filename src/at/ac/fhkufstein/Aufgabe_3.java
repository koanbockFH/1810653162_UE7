package at.ac.fhkufstein;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe_3
{
    public static void main(String[] args)
    {
        String eingabe = JOptionPane.showInputDialog("gib eine e-mail ein:");

        try
        {
            checkEmail(eingabe);
        }
        catch(Exception e)
        {
            System.err.println("EIn Fehler ist aufgetreten\nStackTrace:");
            e.printStackTrace();
        }
    }

    private static boolean checkEmail(String s)
    {
        Pattern pattern = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );
        Matcher m = pattern.matcher(s);
        return m.find();
    }
}

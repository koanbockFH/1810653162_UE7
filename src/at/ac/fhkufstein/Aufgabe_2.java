package at.ac.fhkufstein;

import javax.swing.*;

public class Aufgabe_2
{

    public static void main(String[] args)
    {
        while(true)
        {
            String eingabe = JOptionPane.showInputDialog("Gib eine Zahl ein!");

            if(isNumeric(eingabe))
            {
                break;
            }
        }
    }


    private static Boolean isNumeric(String s)
    {
        try
        {
            Integer.parseInt(s);
        } catch (NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
}



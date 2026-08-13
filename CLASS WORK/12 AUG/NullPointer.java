import java.io.*;

public class Main {
    public static void main (String[] args) {
        String s = null;

        // Checking if s.equals null
        try
        {
            if (s.equals("gfg"))
                System.out.print("Same");
            else 
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException");
        }
    }
}

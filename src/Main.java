import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        String semikolon = ";";
        String line = "";
        String kvFile = "KritiskVej.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(kvFile)))
        {
            while ((line = br.readLine()) !=null)
            {
                String[] kvReader = line.split(semikolon);

                System.out.println("event: " + kvReader[0] + ", task: " + kvReader[1] + ", duration: " + kvReader[2]);


            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
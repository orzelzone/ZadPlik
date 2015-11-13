package com.slawekkami;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws FileNotFoundException  {
	// write your code here
        String file = "test.txt";
        /*Scanner scanner = new Scanner(new File(file));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();*/
        System.out.println("W pliku '" +file+"' jest:");
        System.out.println("Znaki drukowalne:       " + iloscZnak(file));
        System.out.println("Znaki Białe:            " + iloscBialych(file));
        System.out.println("Słowa:                  " + iloscSlow(file));
    }
    public static int iloscSlow(String plik)throws FileNotFoundException {
        Scanner slowa = new Scanner(new File(plik));
        int slowo = 0;
        while (slowa.hasNext()) {
            slowa.next();
            slowo++;
        }
        slowa.close();
        return slowo;
    }

    public static int iloscZnak(String plik)throws FileNotFoundException {
        Scanner znaki = new Scanner(new File(plik)).useDelimiter("[^\\s]");      //[^ \\t\\n\\x0B\\f\\r]");
        int znak = 0;
        while (znaki.hasNext()) {
            znaki.next();
            znak++;
        }
        znaki.close();
        return znak;
    }

    public static int iloscBialych(String plik)throws FileNotFoundException {
        Scanner bialeZnaki = new Scanner(new File(plik)).useDelimiter("[ \\t\\n\\x0B\\f\\r]");
        int bialy = 0;
        while (bialeZnaki.hasNext()) {
            bialeZnaki.next();
            bialy++;
        }
        bialeZnaki.close();
        return bialy;
    }




}

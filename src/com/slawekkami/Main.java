package com.slawekkami;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**Zadanie domowe ze zjazdu 3.
     * Napisać funkcję liczZnakiSlowa, która zlicza:
     * liczbę znaków w pliku,
     * liczbę białych znaków w pliku (białe znaki to spacja, tabulator, znacznik końca wiersza),
     * liczbę słów w pliku.
     *
     * Wynikiem funkcji jest tablica złożona z 3 liczb całkowitych po jednej dla wymienionych podpunktów.
  Wykonał Sławomir Kamiński
  GitHub user: Orzelzone.
 */

public class Main {

    public static void main(String[] args)throws FileNotFoundException {
	// write your code here
        String file = "test.txt";
         int znakiIlosc[] = new int[3];
        znakiIlosc[0] = iloscZnak(file);
        znakiIlosc[1] = iloscBialych(file);
        znakiIlosc[2] = iloscSlow(file);
        System.out.println("W pliku '" +file+"' jest:");
        System.out.println("Znaki drukowalne:       " + znakiIlosc[0]);
        System.out.println("Znaki Białe:            " + znakiIlosc[1]);
        System.out.println("Słowa:                  " + znakiIlosc[2]);
    }
    // metoda zwraca  ilosc słów
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
    // metoda zwraca ilosc znakow drukowalnych
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
    //metoda zwraca ilość znaków białych
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

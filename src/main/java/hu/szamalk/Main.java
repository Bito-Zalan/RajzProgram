package hu.szamalk;

import hu.szamalk.modell.Rajz;

public class Main {
    public static void main(String[] args) {
        Rajz program = new Rajz("#");
        program.konzolRajz();
        program.sorSzamol();
        program.oszlopSzamol();
        program.ellenorizTeleE();


        program.fajlbaIr();
        System.out.println("A kép sikeresen ki lett írva a 'rajz.txt' fájlba!");
    }
}
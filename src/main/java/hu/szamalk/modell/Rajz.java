package hu.szamalk.modell;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Rajz {
    private char [][] rajz;
    private String jel;
    private int meret = 4;

    public Rajz(String jel){
        this.jel = jel;
        this.rajz = new char[meret][meret];
        rajzol();
    }

    public void rajzol() {
        System.out.println("Z kirajzolva:");
        rajz[0][0] = '#'; rajz[0][1] = '#'; rajz[0][2] = '#'; rajz[0][3] = '#';
        rajz[1][2] = '#';
        rajz[2][1] = '#';
        rajz[3][0] = '#'; rajz[3][1] = '#'; rajz[3][2] = '#'; rajz[3][3] = '#';
    }

    public void konzolRajz() {
        for (int i = 0; i < meret; i++) {
            for (int j = 0; j < meret; j++) {
                System.out.print(rajz[i][j] == 0 ? ' ' : rajz[i][j]);
            }
            System.out.println();
        }
    }

    public void sorSzamol(){

        int sorokSzama = rajz.length;
        System.out.println("Sorok száma:" + sorokSzama);

    }
    public void oszlopSzamol(){
        int oszlopokSzama = 0;
        if (rajz.length > 0) {
            oszlopokSzama = rajz[0].length;
        }

        System.out.println("Oszlopok száma: " + oszlopokSzama);
    }

    public void ellenorizTeleE() {
        int teliSorokSzama = 0;
        int teliOszlopokSzama = 0;

        for (int i = 0; i < meret; i++) {
            boolean teliSor = true;
            for (int j = 0; j < meret; j++) {
                if (rajz[i][j] != '#') {
                    teliSor = false;
                    break;
                }
            }
            if (teliSor) {
                teliSorokSzama++;
            }
        }

        for (int j = 0; j < meret; j++) {
            boolean teliOszlop = true;
            for (int i = 0; i < meret; i++) {
                if (rajz[i][j] != '#') {
                    teliOszlop = false;
                    break;
                }
            }
            if (teliOszlop) {
                teliOszlopokSzama++;
            }
        }

        System.out.println("Teli sorok száma: " + teliSorokSzama);
        System.out.println("Teli oszlopok száma: " + teliOszlopokSzama);
    }

    public void fajlbaIr() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("rajz.txt"))) {
            for (int k = 0; k < 100; k++) {
                for (int i = 0; i < meret; i++) {
                    for (int j = 0; j < meret; j++) {
                        writer.write(rajz[i][j] == 0 ? ' ' : rajz[i][j]);
                    }
                    writer.newLine();
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

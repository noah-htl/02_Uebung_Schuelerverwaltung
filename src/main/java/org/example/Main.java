package org.example;

public class Main {
    public static void main(String[] args) {
        LehrerIn falki = new LehrerIn("FALKENSTEINER Markus", 40, 'm', 102);
        LehrerIn groebl = new LehrerIn("GRÖBL Robert", 40, 'm', 103);

        SchuelerIn max = new SchuelerIn("Max Mustermann", 16, 'm', 104);
        SchuelerIn claudia = new SchuelerIn("Claudia Clementine", 17, 'w', 103);

        max.addFehlstunden(3);

        System.out.printf("Max hat %d Fehlstunden!\n", max.getFehlstunden());
        System.out.println("Falkensteiner ist in Raum " + falki.getRaum());
    }
}
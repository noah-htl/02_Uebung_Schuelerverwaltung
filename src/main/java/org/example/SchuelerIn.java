package org.example;

public class SchuelerIn extends Person {
    private final int klasse;
    private final int fehlstunden;
    private static int anzahl = 0;
    public SchuelerIn(String name, int alter, char geschlecht, int klasse) {
        super(name, alter, geschlecht);
        this.klasse = klasse;
        this.fehlstunden = 0;

        anzahl++;
    }

    public int getKlasse() {
        return klasse;
    }

    public int getFehlstunden() {
        return fehlstunden;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    public void addFehlstunden(int fehlstunden) {
        fehlstunden += fehlstunden;
    }
}

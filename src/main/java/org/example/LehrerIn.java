package org.example;

public class LehrerIn extends Person {
    private final int raum;
    public LehrerIn(String name, int alter, char geschlecht, int raum) {
        super(name, alter, geschlecht);
        this.raum = raum;
    }

    public int getRaum() {
        return raum;
    }
}

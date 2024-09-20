package org.example;

public class Person {
    private final String name;
    private final int alter;
    private final char geschlecht;

    public Person(String name, int alter, char geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public char getGeschlecht() {
        return geschlecht;
    }
}

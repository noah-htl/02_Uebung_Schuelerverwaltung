package org.example;

public class Person {
    private String name;
    private int alter;
    private char geschlecht;

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

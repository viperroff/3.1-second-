package ru.kolmykov.name;

public class Name {

    private String name;

    public Name(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

package com.example.lab5_6_ex3;

public class Contact {
    protected String name;
    protected String number;
    protected String linkedin;

    Contact() {}

    Contact(String nume, String numar, String linkedin) {
        this.name = nume;
        this.number = numar;
        this.linkedin = linkedin;
    }

    public String toString() {
        return name+"\n"+number+"\n"+linkedin;
    }
}

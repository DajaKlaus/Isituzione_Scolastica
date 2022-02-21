package com.company;

import java.util.ArrayList;

public class Persona {
    private String cognome;
    private String nome;
    private String codice;
    ArrayList <Integer> data;

    public Persona() {
        cognome = "";
        nome = "";
        codice = "";
        data = new ArrayList<>();
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCodice() {
        return codice;
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cognome='" + cognome + '\'' +
                ", nome='" + nome + '\'' +
                ", codice='" + codice + '\'' +
                ", data=" + data +
                '}';
    }
}

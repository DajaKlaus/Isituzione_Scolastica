package com.company;

import java.util.ArrayList;

public class Aula {
    ArrayList <String> studenti;
    ArrayList <String> docenti;
    ArrayList <Integer> orario;
    ArrayList <String> discipline;

    public Aula() {
        studenti = new ArrayList<>();
        docenti = new ArrayList<>();
        orario = new ArrayList<>();
        discipline = new ArrayList<>();
    }

    public void setStudenti(ArrayList<String> studenti) {
        this.studenti = studenti;
    }

    public void setDocenti(ArrayList<String> docenti) {
        this.docenti = docenti;
    }

    public void setOrario(ArrayList<Integer> orario) {
        this.orario = orario;
    }

    public void setDiscipline(ArrayList<String> discipline) {
        this.discipline = discipline;
    }

    public ArrayList<String> getStudenti() {
        return studenti;
    }

    public ArrayList<String> getDocenti() {
        return docenti;
    }

    public ArrayList<Integer> getOrario() {
        return orario;
    }

    public ArrayList<String> getDiscipline() {
        return discipline;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "studenti=" + studenti +
                ", docenti=" + docenti +
                ", orario=" + orario +
                ", discipline=" + discipline +
                '}';
    }
}

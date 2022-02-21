package com.company;

import java.util.ArrayList;

public class Studente extends Persona{
    private String classe;
    ArrayList <Integer> voti;
    ArrayList <String> disciplina;

    public Studente() {
        super();
        classe = "";
        voti = new ArrayList<>();
        disciplina = new ArrayList<>();
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setVoti(ArrayList<Integer> voti) {
        this.voti = voti;
    }

    public void setDisciplina(ArrayList<String> disciplina) {
        this.disciplina = disciplina;
    }

    public String getClasse() {
        return classe;
    }

    public ArrayList<Integer> getVoti() {
        return voti;
    }

    public ArrayList<String> getDisciplina() {
        return disciplina;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "classe='" + classe + '\'' +
                ", voti=" + voti +
                ", disciplina=" + disciplina +
                '}';
    }
}

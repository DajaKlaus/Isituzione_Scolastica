package com.company;

import java.util.ArrayList;

public class Docente extends Dipendente{
    private int oSettimanali;
    ArrayList <String> discipline;

    public Docente() {
        super();
        oSettimanali = 0;
        discipline = new ArrayList<>();
    }

    public void setoSettimanali(int oSettimanali) {
        this.oSettimanali = oSettimanali;
    }

    public void setDiscipline(ArrayList<String> discipline) {
        this.discipline = discipline;
    }

    public int getoSettimanali() {
        return oSettimanali;
    }

    public ArrayList<String> getDiscipline() {
        return discipline;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "oSettimanali=" + oSettimanali +
                ", discipline=" + discipline +
                '}';
    }
}

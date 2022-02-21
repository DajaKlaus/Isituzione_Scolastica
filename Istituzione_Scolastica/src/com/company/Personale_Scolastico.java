package com.company;

public class Personale_Scolastico extends Dipendente{
    private String ruolo;

    public Personale_Scolastico() {
        super();
        ruolo = "";
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return ruolo;
    }

    @Override
    public String toString() {
        return "Personale_Scolastico{" +
                "ruolo='" + ruolo + '\'' +
                '}';
    }
}

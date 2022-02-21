package com.company;

public class Dipendente extends Persona{
    private int stipendio;
    private int oStraordinario;
    private int pExtra;

    public Dipendente() {
        super();
        stipendio = 0;
        oStraordinario = 0;
        pExtra = 0;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    public void setoStraordinario(int oStraordinario) {
        this.oStraordinario = oStraordinario;
    }

    public void setpExtra(int pExtra) {
        this.pExtra = pExtra;
    }

    public int getStipendio() {
        return stipendio;
    }

    public int getoStraordinario() {
        return oStraordinario;
    }

    public int getpExtra() {
        return pExtra;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "stipendio=" + stipendio +
                ", oStraordinario=" + oStraordinario +
                ", pExtra=" + pExtra +
                '}';
    }
}

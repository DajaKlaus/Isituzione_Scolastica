package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList <Integer> ora = new ArrayList<>();
        ArrayList <String> disciplina = new ArrayList<>();

        String d, gg = null;

        ArrayList <String> studente = new ArrayList<>();


        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci la quantità di ore da cui è composto il tuo orario");
        int ore = in.nextInt();

        System.out.println("Seleziona l'opzione da svolgere: \n"
                + "1.Visualizzazione orario settimanale per un’aula \n"
                + "2.Visualizzazione di informazione su uno studente \n"
                + "3.Visualizzazione delle informazioni degli studenti di una determinata aula \n"
                + "4.Visualizzazione di tutti i voti in una determinata disciplina per uno studente selezionato \n"
                + "5.Visualizzazione di tutti i docenti che insegnano in una determinata aula con la disciplina insegnata."
                + "6.PER IL MEME");
        int decisione = in.nextInt();

        switch (decisione) {
            case 1:
                System.out.println("Inserisci il numero dell'aula");
                int nAula = in.nextInt();
                int cont = 0;
                for (int i = 1; i <= 5; i ++) {
                    switch (i) {
                        case 1:
                            gg = "lunedì";
                            break;
                        case 2:
                            gg = "martedì";
                            break;
                        case 3:
                            gg = "mercoledì";
                            break;
                        case 4:
                            gg = "giovedì";
                            break;
                        case 5:
                            gg = "venerdì";
                            break;
                    }
                    System.out.println(gg);
                    for (int j = 0; j < ore; j++) {
                        System.out.println("inserisci materia per la " + (j + 1) + " ora");
                        d = in.next();
                        ora.add(j + 1);
                        disciplina.add(d);
                    }
                    if (gg.equalsIgnoreCase("lunedì")) {
                        System.out.println(gg);
                    }
                    if (gg.equalsIgnoreCase("martedì")) {
                        System.out.println(gg);
                    }
                    if (gg.equalsIgnoreCase("mercoledì")) {
                        System.out.println(gg);
                    }
                    if (gg.equalsIgnoreCase("giovedì")) {
                        System.out.println(gg);
                    }
                    if (gg.equalsIgnoreCase("venerdì")) {
                        System.out.println(gg);
                    }
                    for (int h = 1; h <= ore; h++) {
                        System.out.println(h + ". " + disciplina.get(cont));
                        cont ++;
                    }
                }
                break;
            case 2:
                System.out.println("Inserisci il numero di ragazzi che vuoi inserire");
                int dim = in.nextInt();

                for (int i = 0; i < dim; i ++) {
                    System.out.println("Inserisci nome studente");
                    String nome = in.next();
                    studente.add(nome);
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
    }
}

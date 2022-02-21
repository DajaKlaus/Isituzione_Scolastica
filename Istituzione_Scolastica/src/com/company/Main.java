package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList <Integer> ora = new ArrayList<>();
        ArrayList <String> disciplina = new ArrayList<>();
        Aula aula = new Aula();

        String d;

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
                for (int i = 1; i <= ore; i++) {
                    System.out.println("inserisci disciplina per la " + i + "^ora");
                    d = in.next();
                    disciplina.add(d);
                    aula.setDiscipline(disciplina);
                }

                for (int i = 0; i <= ore; i++) {
                    System.out.println("orario: \n" +
                            i + " ora: " + disciplina.get(i)); //index out of bounds
                }
                break;
            case 2:
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

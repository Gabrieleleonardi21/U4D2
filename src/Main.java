import entities.*;
import interfaces.Turnabile;

public class Main {
    public static void main(String[] args) {
        // Array polimorfico: ogni elemento è un sottotipo di Dipendente
        Dipendente[] dipendenti = {
                new DipendenteFullTime("111", 2000.00, Dipartimento.PRODUZIONE, 5),
                new DipendentePartTime("222", 0, Dipartimento.VENDITE, 80, 12.50),
                new Dirigente("333", 5000.00, Dipartimento.AMMINISTRAZIONE, 20),
        };

        // Somma degli stipendi calcolati in modo polimorfico
        double totale = 0;
        for (Dipendente d : dipendenti) {
            double stipendio = d.calcolaStipendio();
            System.out.println(d.getMatricola() + ": " + stipendio);
            totale += stipendio;
        }


        System.out.println("Totale stipendi: " + totale);

        Turnabile[] personale = {
                new DipendenteFullTime("123",2000.00,Dipartimento.PRODUZIONE,5),
                new DipendentePartTime("234",0,Dipartimento.VENDITE,140,12.50),
                new Volontario("Pippo",30,"Venditore Amazon"),
                new Volontario("Minnie", 26, "BusinessLady"),
        };
        for (Turnabile t : personale) {
            t.checkIn();
        }
















    }
}
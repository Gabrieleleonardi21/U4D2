import entities.*;
import exeptions.DatiDipendenteNonValidiExeption;
import interfaces.Turnabile;

public class Main {
    public static void main(String[] args) {
        // Array polimorfico: ogni elemento è un sottotipo di Dipendente
        Dipendente[] dipendenti = {
                new DipendenteFullTime("111", 2000.00, Dipartimento.PRODUZIONE, 5),
                new DipendentePartTime("222", 500, Dipartimento.VENDITE, 80, 12.50),
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
                new DipendentePartTime("234",500,Dipartimento.VENDITE,140,12.50),
                new Volontario("Pippo",30,"Venditore Amazon"),
                new Volontario("Minnie", 26, "BusinessLady"),
        };
        for (Turnabile t : personale) {
            t.checkIn();
        }

        //dati non validi
        try {
            Dipendente errato = new DipendenteFullTime("", -5,Dipartimento.VENDITE,3);
            System.out.println("Creato " + errato.getMatricola());
        } catch (DatiDipendenteNonValidiExeption e){
            System.out.println("Impossibile creare il dipendente: " + e.getMessage());
        }
        //dati validi
        try {
            Dipendente corretto = new DipendenteFullTime("144",2000.00,Dipartimento.PRODUZIONE,6);
            System.out.println("Dipendente creato matricola: "+ corretto.getMatricola() + " Stipendio: " + corretto.calcolaStipendio());
        } catch (DatiDipendenteNonValidiExeption e){
            System.out.println("impossibile creare il dipendente: " + e.getMessage());
        }















    }
}
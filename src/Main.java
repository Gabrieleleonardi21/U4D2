import entities.*;

public class Main {
    public static void main(String[] args) {
        Dipendente d1 = new Dipendente("D001", 1800.00, Dipartimento.PRODUZIONE);
        Dipendente d2 = new Dipendente("D002", 2500.50, Dipartimento.AMMINISTRAZIONE);
        Dipendente d3 = new Dipendente("D003", 2000.70, Dipartimento.VENDITE);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);


        DipendenteFullTime ft = new DipendenteFullTime("f001", 2000.00, Dipartimento.AMMINISTRAZIONE, 5);
        DipendentePartTime pt = new DipendentePartTime("p01", 0.00, Dipartimento.VENDITE, 80, 12.50);
        Dirigente dr = new Dirigente("D01", 5000.50, Dipartimento.PRODUZIONE, 150);

        System.out.printf("Full time: %.2f (%.2f * (1 + 0.02 * %d))%n",
            ft.calcolaStipendio(), ft.getStipendio(), ft.getAnniAnzianita());
        System.out.printf("Part time: %.2f (%d ore * %.2f)%n",
            pt.calcolaStipendio(), pt.getOreContratto(), pt.getTariffaOraria());
        System.out.printf("Dirigente: %.2f (%.2f + %d * 50)%n",
            dr.calcolaStipendio(), dr.getStipendio(), dr.getNumeroDipendentiGestiti());

        double totale = ft.calcolaStipendio() + pt.calcolaStipendio() + dr.calcolaStipendio();
        System.out.printf("Totale stipendi: %.2f%n", totale);



    }





}
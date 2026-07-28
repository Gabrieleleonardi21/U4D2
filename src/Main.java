import entities.Dipartimento;
import entities.Dipendente;

public class Main {
    public static void main(String[] args) {
        Dipendente d1 = new Dipendente("D001", 1800.00, Dipartimento.PRODUZIONE);
        Dipendente d2 = new Dipendente("D002", 2500.50, Dipartimento.AMMINISTRAZIONE);
        Dipendente d3 = new Dipendente("D003", 2000.70, Dipartimento.VENDITE);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

    }




}
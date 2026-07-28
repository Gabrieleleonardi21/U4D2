package entities;

public class DipendenteFullTime extends Dipendente {
    private final int anniAnzianita;
    public DipendenteFullTime(String matricola, double stipendio, Dipartimento dipartimento, int anniAnzianita) {
        super(matricola, stipendio, dipartimento);
        this.anniAnzianita = anniAnzianita;
    }
    public int getAnniAnzianita(){return anniAnzianita;}
    @Override
    public double calcolaStipendio(){
        return getStipendio()*(1 + 0.02 * anniAnzianita);
    }
    @Override
    public String toString(){
        return "DipendentefullTime{matricola='" + getMatricola() + "'"
                + ", anniAnzianita=" + anniAnzianita
                + ", dipartimento=" + getDipartimento() + "}";
    }


}

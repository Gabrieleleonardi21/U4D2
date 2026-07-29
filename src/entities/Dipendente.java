package entities;

import exeptions.DatiDipendenteNonValidiExeption;
import interfaces.Turnabile;

public abstract class Dipendente implements Turnabile {
    private final String matricola;
    private final double stipendio;
    private Dipartimento dipartimento;

    protected Dipendente(String matricola, double stipendio, Dipartimento dipartimento){
        if (matricola == null || matricola.isBlank()){
            throw new DatiDipendenteNonValidiExeption("La matricola non può essere nulla o vuota");
        } if (stipendio<= 0){
            throw new DatiDipendenteNonValidiExeption("Stipendio non valido: " + stipendio + ". Deve essere maggiore di zero");
        }

        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }


    public abstract double calcolaStipendio();



    @Override
    public void checkIn(){
        System.out.println("Dipendente "+ matricola +" ha iniziato il turno. ");
    }


    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public String toString(){
        return "Dipendente{matricola='" + matricola + "'"
                + ", stipendio="+ stipendio
                +", dipartimento=" + dipartimento + "}";
    }




}

package com.company;

public class Paciente implements Comparable<Paciente> {
    String nombre;
    String sintomas;
    String importancia;

    public Paciente(String[] info){
        this.importancia = info[2];
        this.nombre = info[0];
        this.sintomas = info[1];

    }


    @Override
    public int compareTo(Paciente o) {
        return importancia.compareTo(o.importancia);
    }
}

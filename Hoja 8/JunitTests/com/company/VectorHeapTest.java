package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class VectorHeapTest {
    VectorHeap<Paciente> ejemplo = new VectorHeap<>();
    String paciente1 = "Jose Block, su cemento se ha agrietado, A";
    String paciente2 = "Gabriel Staackmann, loco, B";
    String[] paciente01 = paciente1.split(", ");
    String[] paciente02 = paciente2.split(", ");
    Paciente pacient1 = new Paciente(paciente01);
    Paciente pacient2 = new Paciente(paciente02);
//se comprueba que add funcione a traves de get first, mostrando el primero dado su "importancia"
    @Test
    public void add() {
        ejemplo.add(pacient1);
        ejemplo.add(pacient2);
        Paciente primero = ejemplo.getFirst();
        System.out.println(primero.nombre);
        System.out.println(primero.sintomas);
        System.out.println(primero.importancia);
    }

//debe de regresar el que es de mayor prioridad.
    @Test
    public void remove() {
        ejemplo.add(pacient1);
        ejemplo.add(pacient2);
        Paciente test = ejemplo.remove();
        System.out.println(test.nombre);
        System.out.println(test.sintomas);
        System.out.println(test.importancia);
    }
}
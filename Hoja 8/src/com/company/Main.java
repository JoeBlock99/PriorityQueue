package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {
	// write your code here
        VectorHeap<Paciente> pacientes = new VectorHeap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del archivo de texto que contiene el diccionario.\n");
        File file = new File(input.nextLine());
        Scanner scanner = new Scanner(file);
        System.out.println("Estos son los pacientes:");
        int n = 0;


        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            n++;

            /*if (line.){
                System.out.println("El archivo.txt no tiene una coma o espacio despued de la coma.\n Por favor reinicie el programa.");
            }*/
            // Se imprimen las lineas del programa ingresado por el usuario
            System.out.println("[" + Integer.toString(n) + "]: " + line);
            String[] info = line.split(", ");
            //System.out.println(info[0]);
            Paciente nuevoPacente = new Paciente(info);
            pacientes.add(nuevoPacente);
        }
        scanner.close();
        while(pacientes.isEmpty()== false){
            Paciente paciente = pacientes.remove();
            System.out.println(paciente.nombre);
            System.out.println(paciente.sintomas);
            System.out.println(paciente.importancia + "\n");
        }

    }
}

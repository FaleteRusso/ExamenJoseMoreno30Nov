package com.corenetworks.presentacion;

public class Ej5 {
    public static void main(String[] args) {
        String ora="nunca mates a una mosca sobre la cabeza de un tigre";
        String mayus = ora.toUpperCase();
        System.out.println(mayus);
        String  minus =ora.toLowerCase();
        System.out.println(minus);
        int posicionInicio = ora.indexOf("sobre");
        if (posicionInicio != -1) {
            int posicionFin = posicionInicio + "sobre".length();
            String primeraPalabra = ora.substring(posicionInicio, posicionFin);
            System.out.println("Palabra solicitada: " + primeraPalabra);
        }
        int posicion = ora.indexOf('m');

        if (posicion != -1) {
            System.out.println("'m' está en la posición: " + posicion);
        }
        int numeroCaracteres = ora.length();
        System.out.println("Número de caracteres: " + numeroCaracteres);


    }
}

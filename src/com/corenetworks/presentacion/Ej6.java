package com.corenetworks.presentacion;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Ej6 {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(1993, 8, 30);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        int edad = periodo.getYears();
        System.out.println("Edad: " + edad + " años");
        LocalDate fechaHoy= LocalDate.now();
        System.out.println("Fecha de hoy: " + fechaHoy);
        LocalDate fechaIniciCurso = LocalDate.of(2023, Month.OCTOBER, 9);
        LocalDate nuevaFecha = fechaIniciCurso.plusMonths(2);
        System.out.println("Fecha después de sumar 2 meses: " + nuevaFecha);



    }
}

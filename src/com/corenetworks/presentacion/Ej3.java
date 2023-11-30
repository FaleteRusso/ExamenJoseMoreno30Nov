package com.corenetworks.presentacion;

import java.util.Scanner;

public class Ej3 {public static void main(String[] args) {
    Scanner notaExamen = new Scanner(System.in);
    System.out.println("Escriba un número de 1 a 8");
    int descripcion = 0;
  descripcion = notaExamen.nextInt();
    switch (descripcion){
        case 1:
            System.out.println("Para microcoche");
            break;
        case 2:
            System.out.println("Para automóviles compactos");
            break;
        case 3:
            System.out.println("Para automóviles ultracompactos");
            break;
        case 4:
            System.out.println("Para automóvil familiar");
            break;
        case 5:
            System.out.println("Para vehículo de lujo");
            break;
        case 6:
            System.out.println("Automóvil deportivo");
            break;
        case 7:
            System.out.println("Descapotable");
            break;
        case 8:
            System.out.println("Todoterreno");
            break;
            default:
            System.out.println("el numero introducido no esta en la escala de 0 a 8");
            notaExamen.close();
    }

}
}

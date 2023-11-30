package com.corenetworks.presentacion;

public class Ej4 {
    public static void main(String[] args) {
        int[] num = {-2, 4,-31, 45, -7, 3, -2, 8, -31, 5, 8, 23, -6, -19, 23, 45, 7, 12, -12,-31,26,-18};
        int mayor = num[0];
        int menor = num[0];
        int repValMay = 1;
        int repValMen = 1;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > mayor) {
                mayor = num[i];
            } else if (num[i] == mayor) {
                repValMay++;
            }
            if (num[i] < menor) {
                menor = num[i];
            } else if (num[i] == menor) {
                repValMen++;
            }
        }
        System.out.println("El mayor es: " + mayor);
        System.out.println("Se repite en " + repValMay + " ocasiones");
        System.out.println("El menor es: " + menor);
        System.out.println("Se repite en " + repValMen + " ocasiones");
    }
}


package com.corenetworks.presentacion;

public class Ej4 {
    public static void main(String[] args) {
        int[] num ={-2,4,45,-7,3,-2,8,-31,5,8,23,-6,-19,23,45,7,12,-12};

        int valorMasPequeno = num[0];
        for (int i=0;i< num.length;i++) {
            if (num[i] < valorMasPequeno) {
                valorMasPequeno = num[i];
            }
        }
        System.out.println("El valor más pequeño es: " + valorMasPequeno);

        int valorMasAlto = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > valorMasAlto) {
                valorMasAlto = num[i];
            }
        }
        System.out.println("El valor más alto es: " + valorMasAlto);

    }
}



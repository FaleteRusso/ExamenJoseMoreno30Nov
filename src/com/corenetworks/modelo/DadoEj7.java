package com.corenetworks.modelo;

import java.security.PublicKey;
import java.util.Objects;
import java.util.Random;

public class Ej7 {
    private Random aleatorio;



    public String dibujaUno
    public String dibujaDos;
    public String dibujarTres;
    public String dibujjarCuatro;
    public String dibujarcinco;
    public String dibujarSeis;
    public String lanzarDado;


    public Ej7() {
    }

    public Ej7(Random aleatorio, String dibujaUno, String dibujaDos, String dibujarTres, String dibujjarCuatro, String dibujarcinco, String dibujarSeis, String lanzarDado) {
        this.aleatorio = aleatorio;
        this.dibujaUno = dibujaUno;
        this.dibujaDos = dibujaDos;
        this.dibujarTres = dibujarTres;
        this.dibujjarCuatro = dibujjarCuatro;
        this.dibujarcinco = dibujarcinco;
        this.dibujarSeis = dibujarSeis;
        this.lanzarDado = lanzarDado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ej7 ej7 = (Ej7) o;
        return Objects.equals(aleatorio, ej7.aleatorio) && Objects.equals(dibujaUno, ej7.dibujaUno) && Objects.equals(dibujaDos, ej7.dibujaDos) && Objects.equals(dibujarTres, ej7.dibujarTres) && Objects.equals(dibujjarCuatro, ej7.dibujjarCuatro) && Objects.equals(dibujarcinco, ej7.dibujarcinco) && Objects.equals(dibujarSeis, ej7.dibujarSeis) && Objects.equals(lanzarDado, ej7.lanzarDado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aleatorio, dibujaUno, dibujaDos, dibujarTres, dibujjarCuatro, dibujarcinco, dibujarSeis, lanzarDado);
    }

    public Random getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(Random aleatorio) {
        this.aleatorio = aleatorio;
    }

    public String getDibujaUno() {
        return dibujaUno;
    }

    public void setDibujaUno(String dibujaUno) {
        this.dibujaUno = dibujaUno;
    }

    public String getDibujaDos() {
        return dibujaDos;
    }

    public void setDibujaDos(String dibujaDos) {
        this.dibujaDos = dibujaDos;
    }

    public String getDibujarTres() {
        return dibujarTres;
    }

    public void setDibujarTres(String dibujarTres) {
        this.dibujarTres = dibujarTres;
    }

    public String getDibujjarCuatro() {
        return dibujjarCuatro;
    }

    public void setDibujjarCuatro(String dibujjarCuatro) {
        this.dibujjarCuatro = dibujjarCuatro;
    }

    public String getDibujarcinco() {
        return dibujarcinco;
    }

    public void setDibujarcinco(String dibujarcinco) {
        this.dibujarcinco = dibujarcinco;
    }

    public String getDibujarSeis() {
        return dibujarSeis;
    }

    public void setDibujarSeis(String dibujarSeis) {
        this.dibujarSeis = dibujarSeis;
    }

    public String getLanzarDado() {
        return lanzarDado;
    }

    public void setLanzarDado(String lanzarDado) {
        this.lanzarDado = lanzarDado;
    }
}

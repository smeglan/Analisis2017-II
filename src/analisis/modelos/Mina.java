/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis.modelos;

import java.util.LinkedList;

/**
 *
 * @author JulianCamilo
 */
public class Mina {
    
    private int[][] matrizdepaneles;
    private int filas_columnas;
    private int maxmineros;
    private LinkedList<Deposito> depositos;
    private LinkedList<Minero> mineros;
    private int x;
    private int y;
    private String metal;
    private float valorTotal;
    private float gananciaMina;
    private float valorMineral;
    private String nombreMina;
    private boolean tieneEntrada;

    public Mina() {
    }
    
    public Mina(int tamaño, int x, int y,String metal){
        this.filas_columnas=tamaño;
        this.matrizdepaneles = new int[tamaño][tamaño];
        this.x=x;
        this.y=y;
        this.metal=metal;
    }

    public Mina(int[][] matrizdepaneles, int filas_columnas, int maxmineros, LinkedList<Deposito> depositos, LinkedList<Minero> mineros) {
        this.matrizdepaneles = matrizdepaneles;
        this.filas_columnas = filas_columnas;
        this.maxmineros = maxmineros;
        this.depositos = depositos;
        this.mineros = mineros;
    }

    public Mina(int[][] matrizdepaneles, int filas_columnas, int maxmineros, String metal, float valorTotal, float gananciaMina, String nombre) {
        this.matrizdepaneles = matrizdepaneles;
        this.filas_columnas = filas_columnas;
        this.maxmineros = maxmineros;
        this.depositos = new LinkedList<>();
        this.mineros = new LinkedList<>();
        this.metal = metal;
        this.valorTotal = valorTotal;
        this.gananciaMina = gananciaMina;
        this.nombreMina =nombre;
        this.tieneEntrada=false;
    }

    
    
    /**
     * @return the matrizdepaneles
     */
    public int[][] getMatrizdepaneles() {
        return matrizdepaneles;
    }

    /**
     * @param matrizdepaneles the matrizdepaneles to set
     */
    public void setMatrizdepaneles(int[][] matrizdepaneles) {
        this.matrizdepaneles = matrizdepaneles;
    }

    /**
     * @return the filas_columnas
     */
    public int getFilas_columnas() {
        return filas_columnas;
    }

    /**
     * @param filas_columnas the filas_columnas to set
     */
    public void setFilas_columnas(int filas_columnas) {
        this.filas_columnas = filas_columnas;
    }

    /**
     * @return the maxmineros
     */
    public int getMaxmineros() {
        return maxmineros;
    }

    /**
     * @param maxmineros the maxmineros to set
     */
    public void setMaxmineros(int maxmineros) {
        this.maxmineros = maxmineros;
    }

    /**
     * @return the depositos
     */
    public LinkedList<Deposito> getDepositos() {
        return depositos;
    }

    /**
     * @param depositos the depositos to set
     */
    public void setDepositos(LinkedList<Deposito> depositos) {
        this.depositos = depositos;
    }

    /**
     * @return the mineros
     */
    public LinkedList<Minero> getMineros() {
        return mineros;
    }

    /**
     * @param mineros the mineros to set
     */
    public void setMineros(LinkedList<Minero> mineros) {
        this.mineros = mineros;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the metal
     */
    public String getMetal() {
        return metal;
    }

    /**
     * @param metal the metal to set
     */
    public void setMetal(String metal) {
        this.metal = metal;
    }

    /**
     * @return the valorTotal
     */
    public float getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the gananciaMina
     */
    public float getGananciaMina() {
        return gananciaMina;
    }

    /**
     * @param gananciaMina the gananciaMina to set
     */
    public void setGananciaMina(float gananciaMina) {
        this.gananciaMina = gananciaMina;
    }

    @Override
    public String toString() {
        return this.getNombreMina()+" Es una mina de: "+this.getMetal();
    }

    /**
     * @return the valorMineral
     */
    public float getValorMineral() {
        return valorMineral;
    }

    /**
     * @param valorMineral the valorMineral to set
     */
    public void setValorMineral(float valorMineral) {
        this.valorMineral = valorMineral;
    }

    public String getNombreMina() {
        return nombreMina;
    }

    public void setNombreMina(String nombreMina) {
        this.nombreMina = nombreMina;
    }

    public boolean isTieneEntrada() {
        return tieneEntrada;
    }

    public void setTieneEntrada(boolean tieneEntrada) {
        this.tieneEntrada = tieneEntrada;
    }

    
    
   
    
    
}

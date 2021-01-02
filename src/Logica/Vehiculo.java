
package Logica;

import java.text.DecimalFormat;

public class Vehiculo {
    private int id_vehiculo;
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo() {
    }

    public Vehiculo(int id_vehiculo, String marca, String modelo, double precio) {
        this.id_vehiculo = id_vehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " // Modelo: " + modelo + " //";
    }

    public String formatPrecio(double i) {
        DecimalFormat df = new DecimalFormat("$###,###.00");
        String s = df.format(i);
        return s;
    }
    
    
    
}
